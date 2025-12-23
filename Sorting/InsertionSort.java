class InsertionSort {
    public int[] sortArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int tmp = nums[i];
            int j = i - 1;
            while (j >= 0 && tmp < nums[j]) {
                nums[j + 1] = nums[j];
                nums[j] = tmp;
                j--;
            }
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
