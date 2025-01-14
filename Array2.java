//program to take size of array then create array and store numbers and display sum and average of taken no.
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size, sum=0 ; 
        double avg= 0;
        System.out.println("Enter the size of array ");
        size = in.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the value in array to sum and find average");
        for(int i= 0; i< size; i++){
            a[i]= in.nextInt();
        }
        System.out.println("You have enter values");
        for(int i= 0; i< size; i++){
            System.out.print(a[i]+ " ");

        }
        for(int i= 0; i< size; i++){
            sum = sum + a[i];
        }
        avg = sum/size;
        System.out.println("sum= "+ sum+ " Average ="+ avg);
    }
}
