
/*** 
  runing 4 maman13  questions  by teachers request
  @author:ariel astangelov 
  id :315407726  4/01/2024 
  */
public class Ex13
{
   
   public static int[] specialArr(int[] arr, int med) {
        int count = 0;
        for (int num : arr) {
            if (num < med) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num < med) {
                result[index++] = num;
            }
        }
        
     
        return result;
    }
    
    
    
    
    
    
    public static int first(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
        if (arr[i] <= 0 || arr[i] > n) {
            arr[i] = n + 1; // ממלאים ערך שאינו רלוונטי (גדול מ-n)
        }
    }

    for (int i = 0; i < n; i++) {
        int val = Math.abs(arr[i]); // מתעלמים מסימן שלילי
        if (val <= n) {
            arr[val - 1] = -Math.abs(arr[val - 1]); // מסמנים את התא
        }
    }

    for (int i = 0; i < n; i++) {
        if (arr[i] > 0) {
            return i + 1; // מחזירים את המספר הראשון החסר
        }
    }

    return n + 1;
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






    
    
      public static int extreme(int[][] mat) {
        int n = mat.length;
        return findExtremePath(mat, 0, 0, -1, new boolean[n][n]);
    }
    private static int findExtremePath(int[][] mat, int row, int col, int currentMax, boolean[][] visited) {
        int n = mat.length;
        if (row == n - 1 && col == n - 1) {
            return Math.max(currentMax, mat[row][col]);
        }
        visited[row][col] = true;
        int newMax = Math.max(currentMax, mat[row][col]);
        int minExtreme = Integer.MAX_VALUE;
        if (row + 1 < n && !visited[row + 1][col]) { 
            minExtreme = Math.min(minExtreme, findExtremePath(mat, row + 1, col, newMax, visited));
        }
        if (row - 1 >= 0 && !visited[row - 1][col]) {       
            minExtreme = Math.min(minExtreme, findExtremePath(mat, row - 1, col, newMax, visited));
        }
        if (col + 1 < n && !visited[row][col + 1]) { 
            minExtreme = Math.min(minExtreme, findExtremePath(mat, row, col + 1, newMax, visited));
        }
        if (col - 1 >= 0 && !visited[row][col - 1]) {
            minExtreme = Math.min(minExtreme, findExtremePath(mat, row, col - 1, newMax, visited));
        }
        visited[row][col] = false;

        return minExtreme;
    }
    
    
    
    
    
}
