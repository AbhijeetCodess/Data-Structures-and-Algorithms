import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class maxSubProd {
static int solve(int n, int[] arr){
//CODE HERE 
    int maxprd = -9999999;
    int prd = 1;

    for(int i = 0; i<arr.length; i++){
        prd *= arr[i];
        if(prd>maxprd){
            maxprd = prd;
        }
        if(prd ==0){
            prd = 1;
        }
    }

    prd = 1;
    for(int j = arr.length-1; j>=0; j--){
        prd *= arr[j];
        if(prd > maxprd){
            maxprd = prd;
        }
        if(prd ==0){
            prd = 1;
        }
    }
    return maxprd;
}
public static void main(String[] args) throws Exception{
BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
int n;
int[] arr;
n = Integer.parseInt(bufferedReader.readLine().trim());
arr = new int[n];
arr = Arrays.stream(bufferedReader.readLine().trim().split("\\s")).mapToInt(Integer::parseInt).toArray();
int product = solve(n, arr);
System.out.println(product);
}
}