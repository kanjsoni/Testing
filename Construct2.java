// Wap to take two number and swap them by using parameterised constructor.
import java.util.Scanner;
public class Construct2 {
    public static void main(String[] args) {
    Scanner in= new Scanner(System.in); 
    System.out.println("Enter two number");
    int m= in.nextInt();
    int n= in.nextInt();
    Swap x1= new Swap(m,n);
    x1.display();
    x1.exchange();
    }
}
class Swap{
    int a,b;
    Swap(){
        a=0;
        b=0;
    }
    Swap(int x, int y){
        a= x;
        b= y;
    }
    void display(){
        System.out.println("Original number \n"+"First number : "+a+"\nSecond number : "+b);
    }
    void exchange(){
        int t;
        t= a;
        a= b;
        b=t;
        System.out.println("Swapped number \n"+"First number : "+a+"\nSecond number : "+b);
    }
}
