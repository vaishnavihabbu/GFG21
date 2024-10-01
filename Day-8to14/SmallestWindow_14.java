

class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        // Your code here
        
        int n = s.length();

        int m = p.length();

        

        if (m > n) {

            return "-1";  // If pattern is larger than string, no solution.

        }

        

        // Frequency map for pattern string

        int[] patFreq = new int[256];

        for (int i = 0; i < m; i++) {

            patFreq[p.charAt(i)]++;

        }

        

        // Variables to keep track of the sliding window

        int[] strFreq = new int[256];

        int start = 0, minLen = Integer.MAX_VALUE, startIdx = -1;

        int count = 0;  // Count of characters matched from p

        

        // Traverse the string

        for (int end = 0; end < n; end++) {

            char endChar = s.charAt(end);

            strFreq[endChar]++;

            

            // If the current character matches the pattern's character frequency

            if (patFreq[endChar] != 0 && strFreq[endChar] <= patFreq[endChar]) {

                count++;

            }

            

            // If all characters are matched, try to minimize the window

            while (count == m) {

                // Update the minimum length window

                if (minLen > end - start + 1) {

                    minLen = end - start + 1;

                    startIdx = start;

                }

                

                // Try to shrink the window

                char startChar = s.charAt(start);

                strFreq[startChar]--;

                

                if (patFreq[startChar] != 0 && strFreq[startChar] < patFreq[startChar]) {

                    count--;

                }

                

                start++;

            }

        }

        

        // If no valid window found, return "-1"

        return (startIdx == -1) ? "-1" : s.substring(startIdx, startIdx + minLen);

  


    }
}