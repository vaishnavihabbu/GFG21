/*Node is defined as
class Node
{
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}*/

class Solution {
    static final long MOD = 1000000007;
    public long listToNumber(Node head){
        long ans = 0;
        Node temp = head;
        
        while(temp!=null){
            ans=(ans*10+temp.data)%MOD;
            temp=temp.next;
        }
        
        return ans;
    }
    
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long firstNum=listToNumber(first);
        long secondNum=listToNumber(second);
        secondNum = firstNum*secondNum;
        
        return secondNum%MOD;
    }
}