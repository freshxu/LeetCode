class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        if (str.length() == 0) {
            return 0;
        }
        int length = 0;
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                break;
            } else {
                length++;
            }
        }
        return length;
    }
}
