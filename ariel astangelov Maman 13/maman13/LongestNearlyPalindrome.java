 

public class LongestNearlyPalindrome {

    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 10, 10, 4, 3, 10, 10};
    }

    // Main method to find the longest nearly-palindromic sequence
    public static int longestNearlyPal(int[] arr) {
        return findLongest(arr, 0, arr.length - 1, false);
    }

    // Recursive helper method
    private static int findLongest(int[] arr, int left, int right, boolean removed) {
        // Base case: If pointers cross, there is no sequence
        if (left > right) {
            return 0;
        }

        // If the current sequence is already a palindrome
        if (arr[left] == arr[right]) {
            return 2 + findLongest(arr, left + 1, right - 1, removed);
        }

        // If we haven't removed an element yet, try removing one element
        if (!removed) {
            int removeLeft = findLongest(arr, left + 1, right, true);
            int removeRight = findLongest(arr, left, right - 1, true);
            return Math.max(removeLeft, removeRight);
        }

        // If already removed an element and there's a mismatch, sequence breaks
        return 0;
    }
}
