public class Main {
    public static void main(String[] args) {
        Ex13 ex = new Ex13();

        // Example for specialArr
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int med = 4;
        System.out.println("specialArr Result:");
        int[] specialResult = ex.specialArr(arr1, med);
        for (int num : specialResult) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Example for first
        int[] arr2 = {3, 4, -1, 1};
        System.out.println("first Result: " + ex.first(arr2));

        // Example for longestNearlyPal
        int[] arr3 = {1, 2, 3, 2, 1, 2, 3};
        System.out.println("longestNearlyPal Result: " + ex.longestNearlyPal(arr3));

        // Example for extreme
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("extreme Result: " + ex.extreme(mat));
    }
}