package StringsAndArraylist;


    

import java.io.*;
import java.util.*;

public class StringWithDifferenceOfEveryTwoConsecutiveCharacters {

	public static String solution(String str){
		// write your code here
		String ans = ""+ str.charAt(0);
		
		for(int i = 1; i<str.length(); i++){
		    char prev = str.charAt(i-1);
		    char curr = str.charAt(i);
		    int diff = curr - prev;
		    ans += diff;
		    ans += curr;
		}

		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}