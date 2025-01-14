import java.util.Scanner;
public class AOC {
    public static void main(String[] args) {
       double pi = 3.14, r , A ;
         
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the value of radius");
        r= in.nextDouble();
        A= (r!=0)?pi*r*r: 0;
        System.out.println("Area of circle ="+A);
    }
    
}
