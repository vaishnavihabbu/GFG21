

// User function Template for Java

/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}

*/
class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
        private void inorderTraversal(Node root, List<Integer> result) {
        if (root == null) return;

        inorderTraversal(root.left, result);   // Traverse the left subtree
        result.add(root.data);                 // Add current node's data
        inorderTraversal(root.right, result);  // Traverse the right subtree
    }

    // Helper function to merge two sorted lists
    private List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        // Merge the two sorted lists
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        // Add remaining elements from list1, if any
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        // Add remaining elements from list2, if any
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public List<Integer> merge(Node root1, Node root2) {
        List<Integer> bst1Elements = new ArrayList<>();
        List<Integer> bst2Elements = new ArrayList<>();

        // Perform in-order traversal on both BSTs to get their elements in sorted order
        inorderTraversal(root1, bst1Elements);
        inorderTraversal(root2, bst2Elements);

        // Merge the two sorted lists
        return mergeSortedLists(bst1Elements, bst2Elements);
    }

}