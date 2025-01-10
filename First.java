 // program to create a frequency table using array data
import java.util.Scanner;
import java.util.Arrays;
public class First {
    public static void main( String[] arg){
        Scanner in = new Scanner(System.in);
        int i,j;
        System.out.println("enter the number of column for array");
        int size = in.nextInt();
        int [] n= new int[size];
        boolean [] visited = new boolean [size];
        Arrays.fill(visited, false);
        System.out.println("Enter data");
        for(i= 0; i< size; i++){
            n[i]= in.nextInt();
        }
        System.out.println("\t Data"+"\tFrequency");
        for(i= 0; i< size; i++){
            if(visited[i]== true) {
                continue;
            } 
           int count = 1;
        
        for( j= i+1; j< size; j++){
            if(n[i]== n[j]){
                count ++;
                visited[j]= true;

            }
        }
        System.out.println("\t"+n[i]+"\t"+ count);
    }
}
    
}

}