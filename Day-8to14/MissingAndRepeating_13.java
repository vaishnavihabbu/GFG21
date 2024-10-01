

// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] ans = new int[2];
        
        if(arr.length==1){
            if(arr[0]==1){
                return ans;
            }else{
                ans[0]=arr[0];
                ans[1]=1;
                return ans;
            }
        }
        
        
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        
        for(int val:hm.keySet()){
            int freq = hm.get(val);
            if(freq==2){
                ans[0]=val;
                break;
            }
        }
        
        
        for(int i=1;i<=arr.length;i++){
            if(hm.containsKey(i) != true){
                ans[1]=i;
                break;
            }
        }
        
        return ans;
    }
}
