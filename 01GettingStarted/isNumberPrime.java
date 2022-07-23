
import java.util.*;
  
public class isNumberPrime {
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
       int t = scn.nextInt();
       for(int i = 0; i<t; i++){
           int n = scn.nextInt();
           boolean prime = isPrime(n);
           if(prime){
               System.out.println("prime");
           }else{
               System.out.println("not prime");
           }
       }
  
   }
   public static boolean isPrime(int n ){
       
       for(int i = 2; i*i <= n; i++){
           if(n%i == 0){
               return false;
           }
       }
       return true;
   }
  }
