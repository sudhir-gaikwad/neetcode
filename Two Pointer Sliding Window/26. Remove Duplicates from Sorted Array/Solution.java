class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];
            }
        }
        return left + 1;
    }
}

// class Solution {
//     public int removeDuplicates(int[] nums) {
//         if (nums.length == 0) return 0;
//         int index = 1;
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] != nums[i - 1]) {
//                 nums[index] = nums[i];
//                 index++;
//             }
//         }
//         return index;
//     }
// }