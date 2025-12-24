import java.util.Arrays;

class BubbleSort {

    public static void main(String[] args) {
        int input[] = {4, 5, 1, 8, 4};
        int[] result = sortArray(input);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortArray(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
        return nums;
    }
}

// Bubble sort - O(n2)
// Repeatedly swapping adjacent elements. It requies n passes. Each pass moves the biggest element to the end.
// 1. Sorts the array using multiple passes. After the first pass, the maximum goes to end (its correct position). Same way, after second pass, the second largest goes to second last position and so on.
// 2. In every pass, process only those that have already not moved to correct position. After k passes, the largest k must have been moved to the last k positions.
