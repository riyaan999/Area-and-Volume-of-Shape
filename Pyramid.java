import java.util.Scanner;

// Class representing a pyramid
public class Pyramid extends Shape implements Volume {
    private double baseLength;
    private double height;

    @Override
    public void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base length of the pyramid: ");
        baseLength = scanner.nextDouble();
        System.out.print("Enter the height of the pyramid: ");
        height = scanner.nextDouble();

        double area = baseLength * (baseLength + Math.sqrt(Math.pow(baseLength / 2, 2) + Math.pow(height, 2)));
        System.out.println("Surface area of the pyramid: " + area);
    }

    @Override
    public void calculatePerimeter() {
        // Perimeter is not applicable for a pyramid
        System.out.println("Perimeter is not applicable for a pyramid.");
    }

    @Override
    public void calculateVolume() {
        double volume = (1.0 / 3.0) * Math.pow(baseLength, 2) * height;
        System.out.println("Volume of the pyramid: " + volume);
    }
}
