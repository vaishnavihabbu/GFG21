// User function Template for Java

class Solution {
    public int minimizeCost(int k, int arr[]) {
        // code here
        
         int n = arr.length;
        int[] dp = new int[n];  // dp[i] represents the minimum cost to reach stone i
        Arrays.fill(dp, Integer.MAX_VALUE);  // Initialize all dp values to a large number
        dp[0] = 0;  // Starting from the first stone, so the cost is 0

        for (int i = 1; i < n; i++) {
            // For each stone i, we check all possible jumps from i-k to i-1
            for (int j = Math.max(0, i - k); j < i; j++) {
                dp[i] = Math.min(dp[i], dp[j] + Math.abs(arr[i] - arr[j]));
            }
        }

        return dp[n - 1];
    }
}