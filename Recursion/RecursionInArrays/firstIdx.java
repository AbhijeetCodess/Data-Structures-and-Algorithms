package Recursion.RecursionInArrays;

import java.io.*;
import java.util.*;

public class firstIdx {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); 
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int x = in.nextInt();
        int fidx = firstIndex(arr,0,x);
        System.out.println(fidx);
    }

    public static int firstIndex(int[] arr, int idx, int x){
        
        if(idx == arr.length){
            return -1;
        }else if(arr[idx] == x){
            return idx;
        }
        
        return firstIndex(arr,idx+1,x);
        
    }

}
