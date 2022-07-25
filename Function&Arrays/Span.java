
    

import java.io.*;
import java.util.*;

public class Span {

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner in = new Scanner(System.in);
    int n  = in.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i<n; i++){
        arr[i] = in.nextInt();
    }
    int max = arr[0];
    int min = arr[0];
    for(int i = 1; i<n; i++){
        if(arr[i] > max){
            max = arr[i];
        }
        if(arr[i] < min){
            min = arr[i];
        }
    }
    int span = max - min;
    System.out.println(span);
 }

}