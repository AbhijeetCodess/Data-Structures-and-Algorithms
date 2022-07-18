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
public class Main {
static int[] solve(int n, int[] arr){
//CODE HERE 
    int[] res = new int[n];

    int product = 1;
    for(int i = 0; i<arr.length; i++){
        res[i] = product;
        product *= arr[i];
    }

    product = 1;

    for(int j = arr.length-1; j>=0; j--){
        res[j] = res[j]*product;
        product *= arr[j];
    }
    return res;
}
public static void main(String[] args) throws Exception{
BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
int n;
int[] arr;
n = Integer.parseInt(bufferedReader.readLine().trim());
arr = new int[n];
arr = Arrays.stream(bufferedReader.readLine().trim().split("\\s")).mapToInt(Integer::parseInt).toArray();
int[] res = solve(n, arr);
System.out.println(Arrays.toString(res).replaceAll("\\[|\\]|,", ""));
}
}
