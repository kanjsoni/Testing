// program to find armstrong number or not

import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
       Armstrongnum x1 = new Armstrongnum();
       x1.number(); 
    }
}

class Armstrongnum{
    Scanner in= new Scanner(System.in);
    void number(){
        System.out.println("Enter any number ");
        int number= in.nextInt();
        int n= number;
        int count= 0;
        while(n!= 0){
            n= n/10;
            count ++;
        }
        int cnt, rem, mul= 1, result= 0;
        cnt= count;
        while(n!= 0){
            rem= n%10;
            while (cnt!= 0) {
                mul= mul*rem; 
            }
            result= result+ mul;
            cnt= count;
            n= n/10;
            mul= 1;
        }
        if(result== n){
            System.out.println("Number "+ number+ " is a armstrong number");
        }else{
            System.out.println("Number "+number+ " is not a armstrong number");
        }
    }
}