public class Sphere extends Shape {
    private double radius;
    // Constructor
    public Sphere(double radius) {
        this.radius = radius;
    }
    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    
    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // toString method
    @Override
    public String toString() {
    return String.format("Sphere with radius %.2f: Surface Area = %.2f, Volume = %.2f",
     radius, surfaceArea(), volume());
    }
}
