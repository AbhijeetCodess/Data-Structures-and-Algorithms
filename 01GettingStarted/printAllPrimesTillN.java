
    

import java.util.*;

public class printAllPrimesTillN {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        
        for(int i = low; i<= high; i++){
            int j = 2;
            for( j = 2; j*j<i; j++){
                if(i%j==0){
                    break;
                }
            }
            if(j*j>i){
                System.out.println(i);
            }
            
        }
    }
}
