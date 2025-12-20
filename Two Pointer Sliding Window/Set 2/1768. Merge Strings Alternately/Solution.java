class Solution {
    public String mergeAlternately(String word1, String word2) {
        char arr1[] = word1.toCharArray();
        char arr2[] = word2.toCharArray();
        char arr[] = new char[arr1.length + arr2.length];
        int index1 = 0;
        int index2 = 0;
        int i = 0;
        while (i < arr1.length + arr2.length) {
            if (index1 < arr1.length) {
                arr[i] = arr1[index1];
                index1++;
                i++;
            }
            if (index2 < arr2.length) {
                arr[i] = arr2[index2];
                i++;
                index2++;
            }
        }
        return new String(arr);
    }
}
// Other
// class Solution {
//     public String mergeAlternately(String word1, String word2) {
//         StringBuilder merged = new StringBuilder();
//         int maxLength = Math.max(word1.length(), word2.length());
//         for (int i = 0; i < maxLength; i++) {
//             if (i < word1.length()) {
//                 merged.append(word1.charAt(i));
//             }
//             if (i < word2.length()) {
//                 merged.append(word2.charAt(i));
//             }
//         }
//         return merged.toString();
//     }
// }
