
import java.io.*;
import java.util.*;

public class RotateBy90Degree {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[][] arr = new int[n][n];
    for(int i = 0; i<n; i++){
        for(int j = 0; j<n; j++){
            arr[i][j] = in.nextInt();
        }
    }
    
    // finding transpose of matrix;
    
    for(int i = 0; i<n; i++){
        for(int j= i+1; j<n; j++){
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
    }
    
    // swapping matrix
    for(int i= 0; i<n; i++){
        int start = 0;
        int end = n-1;
        while(start<end){
            int temp = arr[i][start];
            arr[i][start] = arr[i][end];
            arr[i][end] = temp;
            start++;
            end--;
        }
    }
    display(arr);
    
  }

  public static void display(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

}
