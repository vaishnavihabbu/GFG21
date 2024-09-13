class Node
{
    int data;
    Node left, right;
   Node(int item)
   {
        data = item;
        left = right = null;
    }
} 

class Solution {
    // Function to convert a binary tree into its mirror tree.
    Node mirror(Node node) {
        // Your code here
        
        if(node==null){
            return node;
        }
        
        Node left = mirror(node.left);
        Node right = mirror(node.right);
        
        node.left = right;
        node.right = left;
        
        return node;
        
    }
}