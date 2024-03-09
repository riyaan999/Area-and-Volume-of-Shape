import java.util.Scanner;

// Class representing a square
public class Square extends Shape {
    private double side;

    @Override
    public void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        side = scanner.nextDouble();

        double area = Math.pow(side, 2);
        System.out.println("Area of the square: " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 4 * side;
        System.out.println("Perimeter of the square: " + perimeter);
    }
}
