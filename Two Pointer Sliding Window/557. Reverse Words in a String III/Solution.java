class Solution {
    public String reverseWords(String s) {
        char arr[] = s.toCharArray();
        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1 || arr[i + 1] == ' ') {
                int right = i;
                while (left < right) {
                    char tmp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = tmp;
                    left++;
                    right--;
                }
                left = i + 2;
            }
        }
        return new String(arr);
    }
}