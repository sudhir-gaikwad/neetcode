class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int left = 0;
        int right = 0;
        while (right < typed.length()) {
            if (left < name.length() && typed.charAt(right) == name.charAt(left)) {
                left++;
                right++;
            } else if (left > 0 && typed.charAt(right) == name.charAt(left - 1)) {
                right++;
            } else {
                return false;
            }
        }
        return left == name.length();
    }
}