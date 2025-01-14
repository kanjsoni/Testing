// wap to take two number display them by using default constructor
import java.util.Scanner;
public class Construct1 {
    public static void main(String[] args) {
      Sum x1= new Sum();
      x1.display();
      x1.add();  
    }
    
}
class Sum{
    int a, b;
    Sum(){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter two numbers:");
        a= in.nextInt();
        b= in.nextInt();
    }
    void display(){
        System.out.println("First number= "+ a+"\nSecond number= "+b);
    }
    void add(){
        System.out.println("Sum= "+(a+b));
    }
}
