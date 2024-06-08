public class ShapeArray {
        public static void main(String[] args) {
        Shape sphere = new Sphere(6);
        Shape cylinder = new Cylinder(4, 10);
        Shape cone = new Cone(4, 8);
        // Storing instances of different shapes in this array
        Shape[] shapeArray = {sphere, cylinder, cone};
        for (Shape shape : shapeArray) {
            System.out.println(shape);
        }
    }
}
