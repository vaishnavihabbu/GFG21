
class Node
{
	Node left, right;
	int data;
	
	Node(int d)
	{
		data = d;
		left = right = null;
	}
	
}

//This function should return head to the DLL

class Solution
{
    Node head = null;  // Head of the DLL
    Node prev = null;  // Previous node in DLL
    //Function to convert binary tree to doubly linked list and return it.
	
    Node bToDLL(Node root) {
        if (root == null) return null;

        // Recursively convert the left subtree
        bToDLL(root.left);

        // Convert the current node
        if (prev == null) {
            head = root;  // First node becomes the head of DLL
        } else {
            root.left = prev;  // Link the current node's left to prev
            prev.right = root; // Link prev's right to current node
        }
        prev = root;  // Update prev to current node

        // Recursively convert the right subtree
        bToDLL(root.right);

        return head;
    }
}