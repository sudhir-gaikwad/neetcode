class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}

// class Solution {
//     public int removeElement(int[] nums, int val) {
//         if (nums.length == 0) return 0;
//         int left = 0;
//         int count = 0;
//         for (int right = 0; right < nums.length; right++) {
//             if (nums[left] == val) {
//                 if (nums[right] != val) {
//                     nums[left] = nums[right];
//                     nums[right] = val;
//                     left++;
//                     count++;
//                 }
//             } else {
//                 left++;
//                 count++;
//             }
//         }
//         return count;
//     }
// }
