class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int j = 1; // Pointer for odd indices

        for (int i = 0; i < n; i += 2) {
            if (nums[i] % 2 != 0) {
                // Move j forward (only through odd indices) until an even number is found
                while (j < n && nums[j] % 2 != 0) {
                    j += 2;
                }

                if (j < n) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
// Alternate
// class Solution {
//     public int[] sortArrayByParityII(int[] nums) {
//         int left = 0;
//         int right = left + 1;
//         while (right < nums.length) {
//
//             if (left % 2 == 0) {
//                 if (nums[left] % 2 == 0) {
//                     left++;
//                     right++;
//                 } else if (nums[right] % 2 == 0) {
//                     int tmp = nums[left];
//                     nums[left] = nums[right];
//                     nums[right] = tmp;
//                     left++;
//                 } else {
//                     right++;
//                 }
//             } else if (left % 2 != 0) {
//                 if (nums[left] % 2 != 0) {
//                     left++;
//                     right++;
//                 } else if (nums[right] % 2 != 0) {
//                     int tmp = nums[left];
//                     nums[left] = nums[right];
//                     nums[right] = tmp;
//                     left++;
//                 } else {
//                     right++;
//                 }
//             }
//         }
//         return nums;
//     }
// }
