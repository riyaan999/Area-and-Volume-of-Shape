import java.util.Scanner;

// Class representing a rectangle
public class Rectangle extends Shape {
    private double length;
    private double width;

    @Override
    public void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();

        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
