package geometry;

public class Triangle extends GeometricObject {
    private final double Base;
    private final double Height;
    private final double Side1;
    private final double Side2;


    public Triangle(double Base,double Height,double Side1,double Side2) {
        requirePositive("Base", Base);
        requirePositive("Height", Height);
        requirePositive("side1", Side1); 
        requirePositive("side2", Side2);
        
        this.Base = Base;
        this.Height = Height;       
        this.Side1 = Side1;
        this.Side2 = Side2;
    }
    
    @Override
    public double getArea() {
        return 0.5*Base*Height;
    }

    @Override
    public double getPerimeter() {
        return Side1+Side2+Base;
    }
    public double GetBase(){return Base; }
    public double GetHeight(){return Height; }
    public double GetSide1(){return Side1; }
    public double GetSide2(){return Side2; }
    
}