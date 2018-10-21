class Solution {
    public int longestPalindrome(String s) {
        boolean[] map = new boolean[126];
        int length = 0;
        for (char c : s.toCharArray()) {
            map[c] = !map[c];
            if (!map[c]) {
                length += 2;
            }
        }
        if (length < s.length()) {
            length += 1;
        }
        return length;
    }
}
