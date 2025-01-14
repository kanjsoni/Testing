import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of lines you wat to print this pattern");
        int n= in.nextInt();
        for(int row= 0; row <=n; row++)
              {
                for(int space= 0; space<n-row; space++){
                    System.out.print(" ");
                } 
                for(int col =1; col<=2*row-1; col++){
                    if((row+col)%2==0){
                        System.out.print("0");
                    }else{
                        System.out.print("1");
                    }
                }
                System.out.println();
              }
    }
}   
