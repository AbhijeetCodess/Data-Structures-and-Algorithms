package StringsAndArraylist;

import java.io.*;
import java.util.*;

public class ToggleCase {

	public static String toggleCase(String str){
		//write your code here
		String ans = "";
		for(int i = 0; i<str.length(); i++){
		    char chAti = str.charAt(i);
		    int asciValue = chAti;
		    if(asciValue >= 65 && asciValue <=90){
		        ans  += (char)(asciValue+32);
		    }else if(asciValue >=97 && asciValue <= 122){
		        ans += (char)(asciValue -32);
		    }
		    
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
