package Recursion.RecursionInArrays;

import java.io.*;
import java.util.*;

public class DisplayArrayElements {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = in.nextInt();
        }
        displayArr(a,0);
    }

    public static void displayArr(int[] arr, int idx){
        
        if(idx == arr.length){
            return;
        }
        
        System.out.println(arr[idx]);
        displayArr(arr,idx+1);
    }

}
