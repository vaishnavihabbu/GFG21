import java.util.*;

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        Queue<Integer> pq = new LinkedList<>();
        Queue<Integer> nq = new LinkedList<>();
        
        for(int val : arr){
            if(val>=0){
                pq.add(val);
            }else{
                nq.add(val);
            }
        }
        
        arr.clear();
        
        while(pq.size()!=0 && nq.size()!=0){
            arr.add(pq.remove());
            arr.add(nq.remove());
        }
        
        while(pq.size()>0){
            arr.add(pq.remove());
        }
        
        while(nq.size()>0){
            arr.add(nq.remove());
        }
    }
}