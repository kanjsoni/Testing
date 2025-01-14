//decimal to binary conversion

import java.util.Scanner;
public class BinaryNo {
    public static void main(String[] args) {
        int decimalNo;
        int [] binaryNo = new int[32];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any Integer");
        decimalNo = in.nextInt();
        int i = 0;
        while(decimalNo !=0){
           binaryNo[i]= decimalNo%2;
           decimalNo= decimalNo/2;
           i++;
        }
        for(int j= i-1; j>= 0; j--)
            System.out.print( binaryNo[j]);
    }
    
}
