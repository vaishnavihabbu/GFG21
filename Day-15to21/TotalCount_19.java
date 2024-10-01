// User function Template for Java

class Solution {
    int countDivisions(int a, int k){
        int count=0;
        while(a>=k){
            a=a-k;
            count++;
        }
        
        if(a==0){
            return count;
        }else{
            return count+1;
        }
    }
    int totalCount(int k, int[] arr) {
        // code here
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int count= countDivisions(arr[i],k);
                sum=sum+count;
        }
        
        return sum;
    }
}