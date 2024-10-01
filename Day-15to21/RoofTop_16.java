


class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        // Your code here
        int count=0;
        int maxCount=0;
        
        for(int i=0; i<arr.length-1;i++){
            if(arr[i+1]>arr[i]){
                count++;
            }else{
                maxCount= Math.max(count,maxCount);
                count=0;
            }
        }
        
        return Math.max(count,maxCount);
    }
}