import java.util.Scanner;
public class AOR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double l, b, A;
        System.out.println("Enter length and breadth of Rectangle");
        l= in.nextDouble();
        b= in.nextDouble();
        A= (l !=0)&& (b!=0)? l*b: 0;
        System.out.println("Area of Rectangle ="+A);
    }

    
}
