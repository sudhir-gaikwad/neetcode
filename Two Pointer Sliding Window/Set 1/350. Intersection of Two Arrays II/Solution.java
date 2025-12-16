class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> uniqueNums1 = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums1) {
            uniqueNums1.put(num, uniqueNums1.getOrDefault(num, 0) + 1);
        }
        for (Integer num : nums2) {
            if (uniqueNums1.containsKey(num)) {
                int count = uniqueNums1.get(num);
                if (count > 0) {
                    uniqueNums1.put(num, count - 1);
                    result.add(num);
                }
            }
        }
        int arr[] = new int[result.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }
}
