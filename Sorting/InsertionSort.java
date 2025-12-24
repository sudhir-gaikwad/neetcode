import java.util.Arrays;

class InsertionSort {

    public static void main(String[] args) {
        int input[] = {4, 5, 1, 8, 4};
        int[] result = sortArray(input);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int tmp = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > tmp) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = tmp;
        }
        return nums;
    }
}

// Insertion Sort
// Logically divides the array in two parts.
// 1. Start with the second element as the first element is assumed to be sorted.
// 2. Compare the second element with the first if the second is smaller then swap them.
// 3. Move to the third element, compare it with the first two, and put it in its correct position
// 4. Repeat until the entire array is sorted
