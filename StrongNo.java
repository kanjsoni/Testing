// program to check Strong number or not

import java.util.Scanner;
public class StrongNo {
    public static void main(String[] args) {
        Strong x1= new Strong();
        x1.compute();
    }
    
}
class Strong {
    Scanner in= new Scanner(System.in);
    void compute(){
        int n, q, rem, i, result=0;
        int fact= 1;
        System.out.println("Enter a number");
        n= in.nextInt();
        q= n;
        while(q!=0 ){
            rem= q%10;
            for(i=1; i<=rem; i++){
                fact= fact*i;
            }
            result= result+ fact;
            fact= 1;
            q= q/10;
        }
        if(result== n){
            System.out.println(n+" is a Strong number");
        }else{
            System.out.println(n+" is not a Strong number");
        }
    }
}
