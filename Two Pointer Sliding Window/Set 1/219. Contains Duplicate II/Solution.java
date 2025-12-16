class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 1) return false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            Integer oldVal = map.get(nums[i]);
            if (oldVal != null && k >= Math.abs(oldVal - i)) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}