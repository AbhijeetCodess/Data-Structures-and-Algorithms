public class nextGreater {
    

static int[] solve(int n, int[] nums){
    //CODE HERE 
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
    
        for(int i = 2*n-1; i>=0; i--){
    
            int t = i%n; 
            while(st.size() !=0 && st.peek() <= nums[t]){
                st.pop();
            }
            if(st.size() == 0){
                nge[t] = -1;
            }else{
                nge[t] = st.peek();
            }
            st.push(nums[t]);
        }
        return nge;
    }
}