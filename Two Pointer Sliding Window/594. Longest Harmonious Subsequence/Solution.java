class Solution {
    public int findLHS(int[] nums) {
        // Step 1: Count the frequency of each number using a HashMap
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // Step 2: Iterate through the map to find harmonious pairs (x, x+1)
        int maxLen = 0;
        for (int num : count.keySet()) {
            // Check if num + 1 exists in the map
            if (count.containsKey(num + 1)) {
                // If it exists, calculate the combined length and update maxLen
                int currentLen = count.get(num) + count.get(num + 1);
                maxLen = Math.max(maxLen, currentLen);
            }
        }

        return maxLen;
    }
}