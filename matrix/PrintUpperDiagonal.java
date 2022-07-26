
import java.io.*;
import java.util.*;

public class PrintUpperDiagonal {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        
        for(int i = 0; i<arr.length; i++){
            for(int j= 0; j<arr[0].length; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        // printing diagonal
        for(int g = 0; g<n; g++){
            
            for(int i = 0, j = g; j<n; i++,j++){
                System.out.println(arr[i][j]);
            }
        }
    }

}
