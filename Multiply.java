// program to multiply two matrix
import java.util.Scanner;

public class Multiply{
    public static void main(String[] args) {
       
     Input x1= new Input();
     x1.matrix1();
    }
}

class Input{
    void matrix1(){
        Scanner in = new Scanner(System.in);
        int arow, acol;
        int i, j, k;
        int sum= 0;
        
        System.out.println("Enter row and column for matrix a");
        arow= in.nextInt();
        acol = in.nextInt();
        int [][]a = new int [arow][acol];
        System.out.println("Enter Elements in Matric a");
        for(i= 0; i<arow; i++){
            for(j= 0; j<acol; j++){
                a[i][j]= in.nextInt();
            }
        }
    
    
        int brow, bcol;
        System.out.println("Enter row and column for matrix b");
        brow= in.nextInt();
        bcol = in.nextInt();
        int [][]b = new int [brow][bcol];
        System.out.println("Enter Elements in Matric b");
        for(i= 0; i<brow; i++){
            for(j= 0; j<bcol; j++){
                b[i][j]= in.nextInt();
            }
        }

        int [][] product= new int[arow][bcol];

        if(brow!= acol){
            System.out.println("Sorry!! We can't multiply matrix a and b");
        }
        else{
            for (i=0; i<arow; i++){
                for(j=0; j<bcol; j++){
                    for(k=0; k< brow; k++){
                        sum += a[i][k]* b[k][j];
                    }
                    product[i][j]= sum;
                    sum= 0;
                }
            }
            System.out.println("Resultant matrix");
            for(i=0; i<arow; i++){
                for(j=0; j<bcol; j++){
                    System.out.print(product[i][j] +"\t");
                }           
                System.out.println();
            }
        }
    }
}
    