package Recursion.RecursionWithArraylist;

import java.io.*;
import java.util.*;

public class GetKPC {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        ArrayList<String> result = getKPC(str);
        System.out.println(result);
    }
    public static String[] map = 
    {
        ".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"
        
    };
    public static ArrayList<String> getKPC(String str) {
       if(str.length() ==0){
           ArrayList<String> bres = new ArrayList<>();
           bres.add("");
           return bres;
       }
       
       char currNum = str.charAt(0);
       String charsForNumber = map[currNum - '0'];
       String ros  = str.substring(1);
       ArrayList<String> res = getKPC(ros);
       
       ArrayList<String> mres = new ArrayList<>();
       for(int i = 0; i<charsForNumber.length(); i++){
           char ch = charsForNumber.charAt(i);
           for(String val: res){
               mres.add(ch+val);
           }
       }
       return mres;
    }
    
}
