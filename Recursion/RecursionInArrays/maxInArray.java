package Recursion.RecursionInArrays;

import java.io.*;
import java.util.*;

public class maxInArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int max= Integer.MIN_VALUE;
        max = maxOfArray(arr,0,max);
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int idx, int max){
        
        if(idx == arr.length){
            return max;
        }
        
        
        if(arr[idx] > max){
            max = arr[idx];
        }
        
         
        
        return maxOfArray(arr,idx+1,max);
        
    }

}
