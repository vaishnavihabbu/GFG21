import java.util.*;

class Solution{
    static int maxLength(String S){
        // code here
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);  // Base index for when a valid substring starts
        int maxLen = 0;
        
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                // Push index of the opening parenthesis
                stack.push(i);
            } else {
                // Closing parenthesis
                stack.pop();  // Pop the last unmatched opening parenthesis (if any)
                
                if (stack.isEmpty()) {
                    stack.push(i);  // Push the current index as a new base for the next valid substring
                } else {
                    // Calculate the length of the valid substring
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }
        return maxLen;
    }
}