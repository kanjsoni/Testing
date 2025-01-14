//Program to find out hcf of two numbers.
import java.util.Scanner;
public class Hcf {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n1, n2, gcd=1;
      System.out.println("Enter two numbers");
      n1= in.nextInt();
      n2= in.nextInt();
      for(int i= 1; i<=n1&& i<= n2; i++){
        if(n1%i==0 && n2%i==0){
            gcd= i;
        }
      }  
      System.out.println("HCF ="+gcd);
    }
}
