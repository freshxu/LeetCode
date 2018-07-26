class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() == 0 || needle.length() > haystack.length()) {
            return -1;
        }
        int i = 0;
        for (; i <= haystack.length() - needle.length(); i++) {
            boolean isSucceed = true;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    isSucceed = false;
                    break;
                }
            }
            if (isSucceed) {
                return i;
            }
        }
        return -1;
    }
}
