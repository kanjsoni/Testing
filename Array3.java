// program to take 5 number using array and again enter a new number and check if that number exist in array remove and display the remaing list

import java.util.Scanner;
public class Array3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size, i;
        System.out.println("Enter the size of array ");
        size = in.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the value in array ");
        for(int i= 0; i< size; i++){
            a[i]= in.nextInt();
        }
        System.out.println("You have enter values");
        for(int i= 0; i< size; i++){
            System.out.print(a[i]+ " ");

        } 
        System.out.println("Enter any no.");
        int n = in.nextInt();
        for(i=0; i<size; i++){
            if (n== a[i]){
                 
            }
        }
    }
}
