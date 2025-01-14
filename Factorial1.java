//program to find factorial of given number

import java.util.Scanner;
public class Factorial1 {
    public static void main(String[] args) {
        long fact =1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = in.nextInt();
        for(int i = 1; i<= n; i++){
             fact = fact*i;
        }
        System.out.println(fact);
    }
}
