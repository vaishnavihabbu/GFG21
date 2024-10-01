

// User function template for JAVA

class Solution {
    // Function to find maximum of each subarray of size k.
    public ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
        // Your code here
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

    for (int i = 0; i < arr.length; i++) {
        // Remove elements not within the window
        while (!deque.isEmpty() && deque.peek() < i - k + 1) {
            deque.poll();
        }

        // Remove elements smaller than the current element
        while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
            deque.pollLast();
        }

        // Add current element at the end of the deque
        deque.offer(i);

        // The front of the deque is the largest element of the current window
        if (i >= k - 1) {
            result.add(arr[deque.peek()]);
        }
    }

    return result;
    }
}