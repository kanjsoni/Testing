//	WAP TO CALCULATE AREA OF NON ZERO RADIUS OF CIRCLE AND CIRCUMFERENCE USING TERNARY OPERATOR.
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        final double pi= 3.14;
        float r ;
        double area, circumference;
        System.out.println("Enter radius of circle");
        Scanner in = new Scanner(System.in);
        r = in.nextFloat();
        area= (r>0)?pi*r*r:0;
        System.out.println("Area of circle"+ area);
        circumference= (r>0)?2*pi*r:0;
        System.out.println("Circumference of circle"+ circumference);
    }
    
}
