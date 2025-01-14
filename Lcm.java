// program to find out LCM of given no.
import java.util.Scanner;
public class Lcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter two no");
        n1= in.nextInt();
        n2= in.nextInt();
        int lcm= (n1>n2)?n1:n2;
        while(true){
            if(lcm %n1 ==0 && lcm% n2 ==0){
                System.out.println("lcm ="+lcm);
                break;
            }
            lcm+=1;
        }
    }
}
