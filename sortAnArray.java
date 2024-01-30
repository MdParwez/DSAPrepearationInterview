public class Solution {
    public int[] sortArray(int[] nums) {
        // Call the quicksort function to sort the array
        quicksort(nums, 0, nums.length - 1);
        return nums; 
    }
    static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            // Find the pivot element such that elements smaller than the pivot are on the left,
            // and elements greater than the pivot are on the right
            int pivot = partition(arr, low, high);

            // Recursively sort the subarrays on the left and right of the pivot
            quicksort(arr, low, pivot);
            quicksort(arr, pivot + 1, high);
        }
    }

    // Partition the array and return the index of the pivot element
    static int partition(int arr[], int low, int high) {
        // Choose the middle element as the pivot
        int pivot = arr[low + (high - low) / 2];

        // Initialize two pointers, i and j
        for (int i = low, j = high; ; i++, j--) {
            // Find the element on the left side that is greater than or equal to the pivot
            while (arr[i] < pivot) i++;

            // Find the element on the right side that is smaller than or equal to the pivot
            while (arr[j] > pivot) j--;

            // If pointers meet or cross, return the index of the rightmost element smaller than or equal to the pivot
            if (i >= j) return j;

            // Swap the elements at positions i and j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}




/*
this will give TLE
public class Solution {
    public int[] sortArray(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quicksort(int[] nums, int low, int high) {
        if (low < high) {
            int pi = partition(nums, low, high);
            quicksort(nums, low, pi - 1);
            quicksort(nums, pi + 1, high);
        }
    }

    private int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        for (int j = low; j < high; j++)
            if (nums[j] < pivot) swap(nums, ++i, j);
        swap(nums, ++i, high);
        return i;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
*/
