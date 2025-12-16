class Solution {
    public int[] diStringMatch(String s) {
        int min = 0;
        int max = s.length();
        int arr[] = new int[max + 1];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                arr[i] = min;
                min++;
            } else {
                arr[i] = max;
                max--;
            }
        }
        arr[s.length()] = min;

        return arr;
    }
}