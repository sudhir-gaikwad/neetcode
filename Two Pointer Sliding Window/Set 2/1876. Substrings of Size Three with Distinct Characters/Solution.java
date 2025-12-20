class Solution {
    public int countGoodSubstrings(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        int count = 0;
        for (int i = 0; i <= s.length() - 3; i++) {
            for (int j = 0; j < 3; j++) {
                hashSet.add(s.charAt(i + j));
            }
            if (hashSet.size() == 3) {
                count++;
            }
            hashSet.clear();
        }
        return count;

    }
}
// Other
// class Solution {
//     public int countGoodSubstrings(String s) {
//         if (s.length() < 3)
//             return 0;
//         int count = 0;
//         int i = 0;
//         int j = i + 3;
//         while (j <= s.length()) {
//             String sub = s.substring(i, j);
//             i++;
//             j = i + 3;
//
//             Set<Character> set = new HashSet<Character>();
//             for (int k = 0; k < sub.length(); k++) {
//                 set.add(sub.charAt(k));
//             }
//             if (set.size() == 3) {
//                 count++;
//             }
//         }
//         return count;
//     }
// }
