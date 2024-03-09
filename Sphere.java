import java.util.Scanner;

// Class representing a sphere
public class Sphere extends Shape implements Volume {
    private double radius;

    @Override
    public void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        radius = scanner.nextDouble();

        double area = 4 * Math.PI * Math.pow(radius, 2);
        System.out.println("Surface area of the sphere: " + area);
    }

    @Override
    public void calculatePerimeter() {
        // Perimeter is not applicable for a sphere
        System.out.println("Perimeter is not applicable for a sphere.");
    }

    @Override
    public void calculateVolume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of the sphere: " + volume);
    }
}
