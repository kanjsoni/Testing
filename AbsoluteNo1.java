import java.util.Scanner;

public class AbsoluteNo1 {

    public static void main(String[] args) {
        int a,z;
        Scanner in = new Scanner(System.in);
       System.out.println("enter any positive or negative no");
        a = in.nextInt();
      z = (a<0)?a*-1: a;
     System.out.println("Absolute no. = "+z);

    }
}
