public class Cylinder extends Shape {
    private double radius;
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
    // toString method
    @Override
    public String toString() {
    return String.format("Cylinder with radius %.2f and height %.2f: Surface Area = %.2f, Volume = %.2f",
    radius, height, surfaceArea(), volume());
    }
}
