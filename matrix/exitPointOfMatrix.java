import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int[][] maze = new int[n][m];
    for(int i = 0; i<n; i++){
        for(int j = 0; j<m; j++){
            maze[i][j] = in.nextInt();
        }
    }
    
    int i = 0;
    int j = 0;
    int dir = 0; // e-0, s-1, w-2, n-3
    
    while(true){
        
        dir  = (dir + maze[i][j])%4;
        
        if(dir == 0){
            j++;
        }else if(dir==1){
            i++;
        }else if(dir==2){
            j--;
        }else if(dir==3){
            i--;
        }
        
        if(i<0){
            i++;
            break;
        }else if(j<0){
            j++;
            break;
        }else if(i==maze.length){
            i--;
            break;
        }else if(j==maze[0].length){
            j--;
            break;
        }
        
    }
    System.out.println(i);
    System.out.println(j);
    
    
  }

}