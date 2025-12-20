class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) {
            return 0;
        }
        Arrays.sort(nums);

        int min = nums[k-1] - nums[0];
        for (int i = k; i < nums.length; i++) {
            int currentDiff = nums[i] - nums[i - k + 1];
            min = Math.min(min, currentDiff);
        }

        return min;
    }
}