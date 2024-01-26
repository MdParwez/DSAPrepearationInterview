import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int N = 6, K = 4;
        int[] P = {2, 6, 4, 3, 1, 5};
        System.out.println(sortArray(N, K, P));  // Output: 3
    }

    public static int sortArray(int N, int K, int[] P) {
        int operations = 0;
        int i = 0;

        while (i < N) {
            if (P[i] == i + 1) {
                i++;
                continue;
            }

            int maxPos = i;
            for (int j = i; j < Math.min(i + K, N); j++) {
                if (P[j] <= i + 1) {
                    maxPos = j;
                }
            }

            Arrays.sort(P, i, maxPos + 1);
            operations++;
            i = maxPos + 1;
        }

        return operations;
    }
}
