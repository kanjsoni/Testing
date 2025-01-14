import java.util.Scanner;

public class ReverseWord {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Message");
        String msg = in.nextLine();
        String [] words = msg.split(" ");
        String rev ="";
        for (int i = words.length-1; i>=0 ; i--){
            rev = rev+words[i] +" ";

        }
        System.out.println(rev.trim());
        
    }
}
