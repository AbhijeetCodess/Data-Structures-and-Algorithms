package StringsAndArraylist;


    
    import java.io.*;
    import java.util.*;
    
    public class StringCompression {
    
        public static String compression1(String str){
            // write your code here
            
            int i = 1;
            while(i<str.length()){
                if(str.charAt(i) == str.charAt(i-1)){
                   str = str.substring(0,i) + str.substring(i+1,str.length());
                   continue;
                }
                i++;
            }
    
            return str;
        }
    
        public static String compression2(String str){
            // write your code here
            String ans = "";
            ans += str.charAt(0);
            int count = 1;
            for(int i = 1; i<str.length(); i++){
                
                if(ans.charAt(ans.length()-1) == str.charAt(i)){
                    count++;
                }else{
                    if(count > 1){
                        ans += count;
                        ans += str.charAt(i);
                        count = 1;
                    }else{
                        ans += str.charAt(i);
                        count = 1;
                    }
                }
            }
            
            if(count > 1){
                ans += count;
            }
            return ans;
    
        }
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String str = scn.next();
            System.out.println(compression1(str));
            System.out.println(compression2(str));
        }
    
    }}

