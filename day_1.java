
//Back-end complete function Template for Java
class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public long minCost(long[] arr) {
        // code here
        PriorityQueue<Long> mh = new PriorityQueue<>();
        long cost = 0;
        
        if(arr.length==1){
            return 0;
        }
        
        for(int i=0;i<arr.length;i++){
            mh.add(arr[i]);
        }
        
        while(mh.size()>0){
            long x = mh.remove();
            long y = mh.remove();
            long sum = x+y;
            cost = cost+sum;
            
            if(mh.size() != 0){
                mh.add(sum);
            }
        }
        
        return cost;
    }
}