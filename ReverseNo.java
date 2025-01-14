import java.util.Scanner ;
public class ReverseNo { 
    public static void main(String args[]){
        int rev = 0;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the no. you want to reverse ");
        int n = in.nextInt();
        System.out.println("you have enter the no. " +n);
        
        
        while (n !=0){
            rev = rev*10 + n%10;
            n = n/10 ;

        }
        System.out.println(" Reverse no is " +rev);
    }


    
}
