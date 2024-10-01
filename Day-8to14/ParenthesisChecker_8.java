import java.util.*;

class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st = new Stack<>();
        
        
        for(int i=0;i<x.length();i++){
            char ch = x.charAt(i);
            
            if(st.size()==0){
                st.push(ch);
                continue;
            }
            
            if((ch=='(') || (ch=='{') || (ch=='[')){
                st.push(ch);
            }else{
                if(ch==')' && (st.peek()=='(')){
                    st.pop();
                }
                else if(ch=='}' && (st.peek()=='{')){
                    st.pop();
                }else if(ch==']' && (st.peek()=='[')){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        
        return st.isEmpty();
    }
}