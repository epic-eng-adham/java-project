package geometry;

public abstract class GeometricObject {
    
    protected static void requirePositive(String name, double value) {
        if (value <= 0) {
            throw new IllegalArgumentException(name + " need a positive number.");
        }
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
