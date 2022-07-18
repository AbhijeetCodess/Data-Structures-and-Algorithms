static int solve(int n, int[] arr){
    //CODE HERE 
        int left = 0;
        int right = arr.length-1;
    
        int maxarea = 0;
    
        while(left<right){
            //find min element at left or right
            int min = 0;
            int distance = 0;
            if(arr[left]<= arr[right]){
                min = arr[left];
                distance = right-left;
                left++;
            }else{
                min = arr[right];
                distance = right-left;
                right--;
            }
    
            int area = min*distance;
            if(area>maxarea){
                maxarea = area;
            }
        }
        return maxarea;
    }