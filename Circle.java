import java.util.Scanner;

// Class representing a circle
public class Circle extends Shape {
    private double radius;

    @Override
    public void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the circle: " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of the circle: " + perimeter);
    }
}
