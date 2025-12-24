import java.util.Arrays;

class SelectionSort {

    public static void main(String[] args) {
        int input[] = {4, 5, 1, 8, 4};
        int[] result = sortArray(input);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortArray(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int tmp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = tmp;
            }
        }
        return nums;
    }
}

// Selection Sort - O(n2)
// Find and move the smallest num to front. It requies n passes.
// 1. Find the smallest element and swap it with the first element. This way we get the smallest element at its correct position.
// 2. Then find the smallest among remaining elements (or second smallest) and swap it with the second element.
// 3. We keep doing this until we get all elements moved to correct position.