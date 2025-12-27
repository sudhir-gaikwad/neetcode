class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            // If the entire needle was matched (j reached needle length)
            if (j == m) {
                return i;
            }
        }
        return -1;
    }
}

// class Solution {
//     public int strStr(String haystack, String needle) {
//         char hay[] = haystack.toCharArray();
//         char need[] = needle.toCharArray();
//         int index = 0;
//         int i = 0, j = 0;
//         while (i < hay.length) {
//             if (hay[i] == need[j]) {
//                 if (j == (need.length - 1)) {
//                     return index;
//                 }
//                 j++;
//                 i++;
//             } else {
//                 index++;
//                 i = index;
//                 j = 0;
//             }
//         }
//         return -1;
//     }
// }
