
import java.io.*;
import java.util.*;

public class SumOfTwoArrays {

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner in = new Scanner(System.in);

    int n1 = in.nextInt();
    int[] a1 = new int[n1];
    for(int i = 0; i<n1; i++){
        a1[i] = in.nextInt();
    }


    int n2 = in.nextInt();
    int[] a2 = new int[n2];
    for(int i = 0; i<n2; i++){
        a2[i] = in.nextInt();
    }

    int big = n1>n2?n1:n2;

    int[] sol = new int[big];


    int i = n1-1;
    int j = n2-1;
    int k = sol.length-1;
    
    int c = 0;
    while (i>=0 || j>=0  ) {
        int d1;
        int d2;
        
        
        if(i<0){
            d1 = 0;
        }else{
            d1 = a1[i];
        }

        if(j<0){
            d2 = 0;
        }else{
            d2 = a2[j];
        }
        
        int d  = d1 + d2 + c;
        c = d/10;
        d = d%10;
        sol[k] = d;

        i--;
        j--;
        k--;
    }

    if(c>0){
        System.out.println(c);
    }

    for(int val: sol){
        System.out.println(val);
    }
 }

}
