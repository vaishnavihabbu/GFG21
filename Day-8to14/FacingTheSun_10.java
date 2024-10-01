

// User function Template for Java

class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        // code here
        Stack<Integer> st = new Stack<>();
        int n = height.length;
        
        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && height[i]>=st.peek()){
                st.pop();
            }
            
            st.push(height[i]);
        }
        
        return st.size();
    }
}