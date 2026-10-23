  package geometry;

  public class Rectangle extends GeometricObject {
      private final double width;
      private final double length;

      public Rectangle(double width, double length) {
          requirePositive("width", width);
          requirePositive("length", length);
         this.width = width;
         this.length = length;
     }

     @Override
     public double getArea() {
         return width * length;
     }

     @Override
     public double getPerimeter() {
         return 2 * (width + length);
     }

     public double getWidth() { return width; }
     public double getHeight() { return length; }
 }
