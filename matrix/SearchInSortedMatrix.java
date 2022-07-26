
import java.io.*;
import java.util.*;

public class SearchInSortedMatrix {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j= 0; j<n; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int x = in.nextInt();
        
        int i = 0;
        int j = n-1;
        
        while(i<n && j>=0){
            if(arr[i][j] == x){
                System.out.println(i + "\n" + j);
                return;
            }else if(arr[i][j] > x){
                j--;
            }else{
                i++;
            }
        }
        
        System.out.println("Not Found");
        
        
    }

}
