import java.util.Random;
import java.util.Scanner;
public class BasketBall {
  public static int simulateBasket( double sRate) {
    if(sRate<0.10|| sRate>1.00){
        System.out.println("Success rate must be between 0.10 to 1.00");
    }
            Random rand = new Random();
        double randomNo = rand.nextDouble();
        if(randomNo < sRate){
            return 50;
        }else{
            return 0;
        }
     }
 public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    System.out.println("Please enter your expected success rate");
    double sRate= in.nextDouble();
    int reward = simulateBasket(sRate);
    System.out.printf("Shot success rate: %.0f%%%n",sRate*100);
    System.out.printf("Reward: %d A-Bucks %n", reward);
}
 }


