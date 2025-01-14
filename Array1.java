//program to take 10 number using array and count how many times number exist 

import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num[]= new int[10];
        System.out.println("Enter 10 number ");
        for(int i= 0 ; i< 10; i++){
            num[i] = in.nextInt();
        }
        System.out.println("You have taken no. ");
        for(int i=0; i<10; i++){
            System.out.print(num[i]+ " ");
        }
        System.out.println("\n enter any number you want to count ");
        int n = in.nextInt();
        int count =0;
        int i=0;
        while(i<10){
            if(n== num[i])
            {
                count ++;
            }
            i++;
        }
        System.out.println("Number "+ n+ "comes"+ count+" times");


    }
    
}
