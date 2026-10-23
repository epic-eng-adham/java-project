package poop2;
import geometry.Triangle;
import geometry.Circle;
import geometry.Rectangle;
import geometry.Square;
import java.util.Scanner;

public class Poop2 {

    public static void calculateTriangle(Scanner input) {
        double b,height,side1,side2;
        while(true){
        System.out.print("Please enter the Base ");
        b = input.nextDouble();
        System.out.print("Please enter the Height");
        height = input.nextDouble();
        System.out.print("Please enter the 1st side ");
        side1 = input.nextDouble();
        System.out.print("please enter the 2th side ");
        side2 = input.nextDouble();
        if(b>0&&height>00&&side1>0&&side2>0){
            break;}
        else{
            System.err.println("Error: the numbers must be positive");}
        }
        Triangle t = new Triangle(b,height,side1,side2);
        System.out.println("Area " + t.getArea());
        System.out.println("Perimeter " + t.getPerimeter());
        
    }    

    public static void calculateCircle(Scanner input) {
        System.out.print("Please enter the radius ");
        double r = input.nextDouble();
        Circle c = new Circle(r);
        System.out.println("Area " + c.getArea());
        System.out.println("Perimeter " + c.getPerimeter());
    }

    public static void calculateRectangle(Scanner input) {
        System.out.print("Please enter the width ");
        double w = input.nextDouble();
        System.out.print("Please enter the length ");
        double h = input.nextDouble();
        Rectangle r = new Rectangle(w, h);
        System.out.println("Area " + r.getArea());
        System.out.println("Perimeter " + r.getPerimeter());
    }

    public static void calculateSquare(Scanner input) {
        System.out.print("Please enter the side length ");
        double s = input.nextDouble();
        Square sq = new Square(s);
        System.out.println("Area " + sq.getArea());
        System.out.println("Perimeter " + sq.getPerimeter());
    }
    
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please choise the shape (circle / rectangle / square / Triangle): ");
        String choice = input.next().toLowerCase();

        switch (choice) {
            case"triangle":
                calculateTriangle(input);
                break;
            case "circle":
                calculateCircle(input);
                break;
            case "rectangle":
                calculateRectangle(input);
                break;
            case "square":
                calculateSquare(input);
                break;
            default:
                System.out.println("Invalied choise!");
        }
    }
}
