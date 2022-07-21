import java.io.*;
import java.util.*;

public class BalancedBrackets {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i<str.length(); i++){
            
            char ch = str.charAt(i);
            
            if(ch == '(' || ch == '[' || ch == '{' ){
                st.push(ch);
            }
            else if(ch == ')' || ch == ']' || ch == '}'){
                
                if(st.size() ==0){
                    System.out.println(false);
                    return;
                }
                else if(ch==')' && st.peek() == '(' || ch == '}' && st.peek() == '{' || ch == ']' && st.peek() == '[' ){
                    st.pop();
                }else{
                    System.out.println(false);
                    return;
                }
                
            }
        }
        
        if(st.size() != 0){
            System.out.println(false);
            return;
        }else{
            System.out.println(true);
            return;
        }
    }

}

