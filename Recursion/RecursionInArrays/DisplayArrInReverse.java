package Recursion.RecursionInArrays;

import java.io.*;
import java.util.*;

public class DisplayArrInReverse {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = in.nextInt();
        }
        displayArrReverse(a,a.length-1);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        
        
        if(idx== -1){
            return;
        }
        
        System.out.println(arr[idx]);
        displayArrReverse(arr,idx-1);
    }

}
