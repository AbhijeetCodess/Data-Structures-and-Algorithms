
import java.util.*;
   
public class RotateANumberByk {
   
   public static void main(String[] args) {
     // write your code here  
     Scanner scn  = new Scanner(System.in);
     int n = scn.nextInt();
     int k = scn.nextInt();
     
     int digits = 0;
     int temp = n;
     while(temp>0){
         digits++;
         temp /= 10;
     }
     
     k = k%digits;
     if (k < 0) k += digits;
     
     int div = 1;
     int mul = 1;
     for(int i = 1; i<= digits; i++){
         if(i<=k){
             div *= 10;
         }else{
             mul *= 10;
         }
     }
     
     int front = n%div;
     int back = n/div;
     int rotated = front*mul + back;
     System.out.println(rotated);
   }
       
   }
