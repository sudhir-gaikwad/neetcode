class Solution {
    public int[] shortestToChar(String s, char c) {
        int result[] = new int[s.length()];
        char arr[] = s.toCharArray();

        int prev = Integer.MIN_VALUE / 2;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                prev = i;
            }
            result[i] = Math.abs(i - prev);
        }
        prev = Integer.MAX_VALUE / 2;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == c) {
                prev = i;
            }
            result[i] = Math.min(result[i], Math.abs(i - prev));
        }
        return result;
    }
}