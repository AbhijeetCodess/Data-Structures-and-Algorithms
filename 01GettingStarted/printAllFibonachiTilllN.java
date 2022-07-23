

import java.util.*;
  
public class printAllFibonachiTilllN {
  
  public static void main(String[] args) {
      // write your code here
      Scanner scn = new Scanner(System.in);
      int a = 0;
      int b = 1;
      int n = scn.nextInt();
      for(int i = 0; i<n; i++){
          System.out.println(a);
          int c = a+b;
           a = b;
           b = c;
      }
   }
  }
