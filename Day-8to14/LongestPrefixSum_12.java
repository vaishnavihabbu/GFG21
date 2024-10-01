

// User function Template for Java

class Solution {
    int lps(String str) {
        // code here
           int n = str.length();

        // LPS array where lps[i] stores the length of the longest proper prefix 
        // which is also a suffix for the substring str[0...i]
        int[] lps = new int[n];
        int length = 0;  // Length of previous longest prefix suffix
        int i = 1;

        // Build the LPS array
        while (i < n) {
            if (str.charAt(i) == str.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        // Return the value of the last element of the LPS array
        return lps[n - 1];
    }
}