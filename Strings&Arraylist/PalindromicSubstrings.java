package Strings&Arraylist;


    
    import java.io.*;
import java.util.*;

public class PalindromicSubstrings {

	public static void solution(String str){
		//write your code here
		
		for(int i = 0; i<str.length(); i++){
		    
		    for(int j = i+1; j<= str.length(); j++){
		        String substr = str.substring(i,j);
		        boolean palindromic = isPalindromic(substr);
		        
		        if(palindromic){
		            System.out.println(substr);
		        }
		    }
		    
		}
		
	}
	public static boolean isPalindromic(String str){
	    int st = 0;
	    int en = str.length()-1;
	    while(st<=en){
	        if(str.charAt(st) != str.charAt(en) ){
	            return false;
	        }
	        st++;
	        en--;
	    }
	    return true;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
}
