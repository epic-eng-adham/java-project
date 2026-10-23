package geometry;

public class Circle extends GeometricObject {
    private final double radius;

    public Circle(double radius) {
        requirePositive("radius", radius);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}

