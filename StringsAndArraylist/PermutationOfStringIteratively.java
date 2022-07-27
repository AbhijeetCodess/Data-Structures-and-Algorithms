package StringsAndArraylist;


import java.io.*;
import java.util.*;


    
public class PermutationOfStringIteratively {
	public static void solution(String str){
		// write your code here
		int n = factorial(str.length());
		
		for(int i = 0; i<n; i++){
		    int temp = i;
		    StringBuilder st  = new StringBuilder(str);
		    String ans = "";
		    
		    for(int j = str.length(); j>=1; j--){
		        int r = temp%j;
		        int q = temp/j;
		        temp = q;
		        ans += st.charAt(r);
		        st.deleteCharAt(r);
		    }
		    
		    System.out.println(ans);
		    
		}
		
	}
	public static int factorial(int n){
	    int fact = 1;
	    for(int i = 2; i<=n; i++){
	        fact *= i;
	    }
	    return fact;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}