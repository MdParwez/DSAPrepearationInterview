import java.util.Arrays;
import java.util.Scanner;

public class PassingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample Input
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // Function call
        int result = passingGame(N, A);

        // Sample Output
        System.out.println(result);
    }

    public static int passingGame(int N, int[] A) {
        // Sorting the array in descending order to maximize the duration of the game
        Arrays.sort(A);
        reverseArray(A);

        // Initializing variables
        int max_duration = 0;
        int current_player = 0;

        // Simulating the game to find the maximum duration
        while (A[current_player] > 0) {
            max_duration++;
            A[current_player]--;
            current_player = (current_player + 1) % N;
        }

        return max_duration;
    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
