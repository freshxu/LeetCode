class Solution {
    public int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        int pow = 1;
        for (int i = chars.length - 1; i >= 0; i--) {
            char ch = chars[i];
            result += (ch - 'A' + 1) * pow;
            pow *= 26;

        }
        return result;
    }
}
