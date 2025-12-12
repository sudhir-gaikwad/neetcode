class Solution {
    public int strStr(String haystack, String needle) {
        char hay[] = haystack.toCharArray();
        char need[] = needle.toCharArray();
        int index = 0;
        int i = 0, j = 0;
        while (i < hay.length) {
            System.out.println("i=" + i + " j=" + j + " Index=" + index);
            if (hay[i] == need[j]) {
                System.out.println("====== i=" + i + " j=" + j);
                if (j == (need.length - 1)) {
                    System.out.println("Returnnnnnn.. : " + index);
                    return index;
                }
                j++;
                i++;
            } else {
                index++;
                i = index;
                j = 0;
                System.out.println("Index:: " + index);
            }

        }
        return -1;
    }
}

// class Solution {
//     public int strStr(String haystack, String needle) {
//         if (needle.isEmpty()) return 0;
//         int n = haystack.length(), m = needle.length();
//         for (int i = 0; i <= n - m; i++) {
//             if (haystack.substring(i, i + m).equals(needle)) return i;
//         }
//         return -1;
//     }
// }