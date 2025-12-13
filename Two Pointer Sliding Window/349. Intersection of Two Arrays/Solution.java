class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> uniqueNums1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int num : nums1) {
            uniqueNums1.add(num);
        }

        for (int num : nums2) {
            if (uniqueNums1.contains(num)) {
                result.add(num);
            }
        }

        int[] arr = new int[result.size()];
        int i = 0;
        for (int n : result) {
            arr[i++] = n;
        }

        return arr;
    }
}