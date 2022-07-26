
import java.io.*;
import java.util.*;

public class SadlePointOfMatrix {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j= 0; j<n; j++){
                matrix[i][j] = in.nextInt();
            }
        }
        
        for(int i = 0; i<n; i++){
            int leastIdx = 0;
            
            for(int j = 1; j<n; j++){
                
                if(matrix[i][j] < matrix[i][leastIdx]){
                    leastIdx = j;
                }
            }
            
            boolean leastIdxIsMaxInColumn = true;
            
            for(int k = 0,j = leastIdx; k<n; k++){
                
                if(matrix[k][j] > matrix[i][leastIdx] ){
                    leastIdxIsMaxInColumn = false;
                    break;
                }
            }
            
            if(leastIdxIsMaxInColumn){
                System.out.println(matrix[i][leastIdx]);
                return;
            }
        }
        
        System.out.println("Invalid input");
        
    }

}