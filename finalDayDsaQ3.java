public class SortArray {
    public static void main(String[] args) {
        int N = 5;
        int[] A = {1, 3, 2, 3, 7};
        String S = "11010";

        // Function Call
        System.out.println(sortArray(N, A, S));
    }

    public static int sortArray(int N, int[] A, String S) {
        // Function to check if array is already sorted
        boolean isSorted = isSorted(A);

        // Base case: If the array is already sorted
        if (isSorted) {
            return 0;
        }

        int operations = 0;
        int i = 0;

        while (i < N) {
            // the longest subarray starting from i with different magic bits at the ends
            int j = i;
            while (j + 1 < N && !(S.charAt(j) != S.charAt(j + 1) && A[j] > A[j + 1])) {
                j++;
            }

            // If no such subarray is found, sorting is impossible
            if (i == j) {
                return -1;
            }

            operations++;
            i = j + 1;
        }

        return operations;
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
