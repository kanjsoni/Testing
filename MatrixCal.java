
import java.util.Scanner;
public class MatrixCal {
    public static void main(String[] args) {
        int i, j, col1, row1, col2, row2 ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size for 1st matrix");
        row1= in.nextInt();
        col1= in.nextInt();
        System.out.println("Enter size foe 2nd matric");
        row2= in.nextInt();
        col2= in.nextInt();

        int [][] m1 = new int [row1][col1];
        int [][] m2 = new int [row2][col2];
        if(row1== row2 && col1== col2){
            System.out.println("Enter value for 1st matrix");
            for(i= 0; i<row1; i++){
                for(j=0; j<col1; j++){
                    m1[i][j]= in.nextInt();
                }
            }
            System.out.println("Enter value for 2nd matrix");
            for(i= 0; i<row2; i++){
                for(j=0; j<col2; j++){
                    m2[i][j]= in.nextInt();
                }
            }
            int [][] sum= new int[row1][col1];
            for(i= 0; i<row1; i++){
                for(j=0; j<col1; j++){
                    sum[i][j] = m1[i][j] + m2[i][j];
                }
            }
            for(i=0; i<row1; i++){
                for(j=0; j<col1; j++){
                System.out.print(sum[i][j] +"\t");
            }
            System.out.println();
        }
    
        }else{
            System.out.println("Can't Add ");
        }
              
    }
        
}
       