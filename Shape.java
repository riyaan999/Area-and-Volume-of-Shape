// Abstract class representing a shape
public abstract class Shape {
    // Non-abstract method to display the selected shape
    public void showShape(String shape) {
        System.out.println("Selected Shape: " + shape);
    }

    // Abstract methods to calculate area and perimeter
    public abstract void calculateShape();
    public abstract void calculatePerimeter();
}
