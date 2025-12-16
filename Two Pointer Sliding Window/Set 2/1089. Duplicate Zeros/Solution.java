class Solution {
    public void duplicateZeros(int[] arr) {
        int i = arr.length - 1;
        int j = i;
        for (int value : arr) {
            if (value == 0) {
                j++;
            }
        }
        System.out.println(i + " " + j);
        while (i != j) {
           if (j < arr.length) {
            arr[j] = arr[i];
           }
           j--;
           if (arr[i] == 0) {
                if (j < arr.length) {
                arr[j] = arr[i];
            }
            j--;
           }
           i--;
        }
    }
}