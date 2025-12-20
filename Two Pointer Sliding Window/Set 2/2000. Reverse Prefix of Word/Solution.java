class Solution {
    public String reversePrefix(String word, char ch) {
        char arr[] = word.toCharArray();
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                int end = i;
                while (start < end) {
                    char tmp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = tmp;
                    start++;
                    end--;
                }
                return new String(arr);
            }
        }
        return word;
    }
}