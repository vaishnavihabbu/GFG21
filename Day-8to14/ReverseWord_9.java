package Day-8to14;

class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        Stack<String> st = new Stack<>();
        
        String ans="";
        String word="";
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch=='.'){
                st.push(word);
                word="";
            }else{
                word = word+ch;
            }
        }
        
        st.push(word);
        
        while(st.size()>1){
            ans = ans + st.pop();
            ans= ans +'.';
        }
        
        ans=ans + st.pop();
        
        return ans;
    }
}

