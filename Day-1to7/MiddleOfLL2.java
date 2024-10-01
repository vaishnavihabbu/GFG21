

class Node{
    int data;
    Node next;
}

public class MiddleOfLL2 {
    int getMiddle(Node head) {
        // Your code here.
        if(head.next==null){
            return head.data;
        }
        
        Node slow = head;
        Node fast = head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        
        if(fast.next==null){//odd
            return slow.data;
        }else{
            return slow.next.data;
        }
    }
}
