

/* Structure of class Node is
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        // Your code here
        Node temp = head;
        int count = 1;
        
        while(temp!=null){
            temp = temp.next;
            if(temp!=null){
                count++;
            }
        }
        
        temp = head;
        int[] arr = new int[count];
        
        for(int i=1;i<=count;i++){
            arr[i-1]=temp.data;
            temp=temp.next;
        }
        
        int sp=0;
        int ep=count-1;

        while(sp<ep){
            if(arr[sp]==arr[ep]){
                sp++;
                ep--;
            }else {
                return false;
            }
        }
        
        return true;
    }
}