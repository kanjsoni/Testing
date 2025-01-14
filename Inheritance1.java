//wap to define a class shape and compute area of square and rectangle by using class and object

import java.util.Scanner;
public class Inheritance1 {
    public static void main(String[] args) {
     Compute x1= new Compute();
     x1.recInput();
     x1.sqInput();
     x1.areaOfRectangle();
     x1.areaOfSquare();   
    }
}

 class Input{
    float a, l,b;
    Scanner in = new Scanner(System.in);
    void sqInput(){
        System.out.println("Enter side of Square");
        a= in.nextFloat();
    }
    void recInput(){
        System.out.println("Enter length and breadth of Rectangle");
        l= in.nextFloat();
        b= in.nextFloat();
    }
}
 class Compute extends Input{
    void areaOfSquare(){
        if(a>0){
            System.out.println("Area of Square :" +(a*a));
    }else{
        System.out.println("Invailed Square" );
    }
        
    }
    void areaOfRectangle(){
        if(l>0 && b>0)
        System.out.println("Area of Rectangle :" +(l*b));
        else
        System.out.println("Invailed Rectangle" );
    }
    
}
