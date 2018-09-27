class Solution {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }

    // solution 2

    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char c = chars[left];
            chars[left++] = chars[right];
            chars[right--] = c;            
        }
        return String.valueOf(chars);
    }
    
}
