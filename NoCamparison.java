// wap to comparison two numbers.
import java.util.Scanner;
public class NoCamparison {
    public static void main(String[] args) {
        int a,b;
        Scanner in= new Scanner(System.in);
        System.out.println("enter two number");
        a= in.nextInt();
        b= in.nextInt();
        if(a>b){
            System.out.println("Greater no is "+a);
        }else{
            System.out.println("Greater no is "+b);
        }
    }
    
}
