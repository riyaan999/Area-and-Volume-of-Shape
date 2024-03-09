/*
* Shape Calculator Program
* Name:Riyaan Chatterjee
* PRN:23070126507
* Batch: SY AIML B3
*/

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Pyramid");
            System.out.println("7. Exit");

            System.out.print("Enter your choice (1-7): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateShape(new Circle());
                    break;
                case 2:
                    calculateShape(new Rectangle());
                    break;
                case 3:
                    calculateShape(new Square());
                    break;
                case 4:
                    calculateShape(new Sphere());
                    break;
                case 5:
                    calculateShape(new Cylinder());
                    break;
                case 6:
                    calculateShape(new Pyramid());
                    break;
                case 7:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
    }

    // Method to calculate area and volume of the selected shape
    private static void calculateShape(Shape shape) {
        shape.showShape(shape.getClass().getSimpleName()); // Display the selected shape
        shape.calculateShape(); // Calculate area
        if (shape instanceof Volume) {
            ((Volume) shape).calculateVolume(); // Calculate volume if the shape implements the Volume interface
        }
    }
}
