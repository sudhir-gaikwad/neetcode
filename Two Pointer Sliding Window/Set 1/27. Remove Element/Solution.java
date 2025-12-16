class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int left = 0;
        int count = 0;
        for (int right = 0; right < nums.length; right++) {
            System.out.println(nums[left] + " " + nums[right]);
            if (nums[left] == val) {
                if (val != nums[right]) {
                    nums[left] = nums[right];
                    nums[right] = val;
                    left++;
                    count++;
                    // System.out.println("-->> " + Arrays.toString(nums));
                }
            } else {
                left++;
                count++;
            }
        }
        return count;
    }
}

// class Solution {
//     public int removeElement(int[] nums, int val) {
//         int i, j;
//         for (i = j = 0; j < nums.length; j++) {
//             if (nums[j] != val) {
//                 nums[i]=nums[j];
//                 i++;
//             }
//         }
//         return i;
//     }
// }
