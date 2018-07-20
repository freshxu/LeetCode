class Solution {
    public String longestCommonPrefix(String[] strs) {
       if (strs.length == 0 || strs[0].length() == 0) {
            return "";
        }
        int i = 0;
        while (i < strs[0].toCharArray().length) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() < i + 1 || strs[0].toCharArray()[i] != strs[j].toCharArray()[i]) {
                    return strs[0].substring(0, i);
                }
            }
            i++;
        }
        return strs[0];
    }
}
