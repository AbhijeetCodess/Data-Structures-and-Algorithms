
import java.util.*;
  
public class SubstractionInAnyBase {
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // write your code here
       int c = 0;
       int rv = 0;
       int power = 1;
       while(n2>0){
           int d2 = n2%10;
           int d1 = n1%10;
           n2 /= 10;
           n1 /= 10;
           d2 = d2+c;
           int d = 0;
           if(d2>=d1){
               c = 0;
               d = d2-d1;
           }else{
               c = -1;
               d2 += b;
               d = d2-d1;
           }
           rv  += d*power;
           power *= 10;
       }
       return rv;
   }
  
  }
  
  
  
  
  
  
  
  
  
  
