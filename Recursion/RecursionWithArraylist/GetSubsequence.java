package Recursion.RecursionWithArraylist;

import java.io.*;
import java.util.*;

public class GetSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        ArrayList<String> list = gss(str);
        System.out.println(list);
    }

    public static ArrayList<String> gss(String str) {
        
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> res = gss(ros);
        
        ArrayList<String> mres = new ArrayList<>();
        
        for(String val: res){
            mres.add("" + val);
        }
        for(String val: res){
            mres.add(ch + val);
        }
        return mres;
    }

}
