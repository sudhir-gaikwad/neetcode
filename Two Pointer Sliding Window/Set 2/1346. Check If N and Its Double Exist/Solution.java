class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            int j = i - 1;
            while (j >= 0) {
                if (arr[i] == (2 * arr[j]) || arr[j] == (2 * arr[i])) {
                    return true;
                }
                j--;
            }
        }
        return false;
    }
}
// Other
// class Solution {
//     public boolean checkIfExist(int[] arr) {
//         Set<Integer> seen = new HashSet<>(); // Use a Set for O(1) average time complexity lookups
//         for (int x : arr) {
//             // Check if 2*x or x/2 (if x is even) has already been seen
//             if (seen.contains(x * 2) || (x % 2 == 0 && seen.contains(x / 2))) {
//                 return true;
//             }
//             seen.add(x);
//         }
//         return false;
//     }
// }