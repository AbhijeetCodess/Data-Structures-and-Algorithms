

import java.util.*;
    
public class GcdAndLcm {
    
    public static void main(String[] args) {
      // write your code here 
      Scanner scn = new  Scanner(System.in);
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
      int smallest = n1;
      int largest = n1;
      if(n2<n1) smallest = n2;
      if(n2>n1) largest = n2;
      
     
      
      // finding gcd
      for(int i = smallest; i>=1; i--){
          if(n1%i == 0 && n2%i == 0){
              System.out.println(i);
              break;
          }
      }
       // finding lcm
      for(int i = largest; i<= n1*n2; i++){
          if(i%n1 == 0 && i%n2 == 0){
              System.out.println(i);
              break;
          }
      }
     }
    }
