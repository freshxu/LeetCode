class Solution {
     public char findTheDifference(String s, String t) {
        int[] ch = new int[26];
        for (char c : s.toCharArray()) {
            ch[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            ch[c - 'a']--;
        }
        int i;
        for (i = 0; i < 26; i++) {
            if (ch[i] != 0) {
                return (char) (i + (int) 'a');
            }
        }

        return 0;
    }
}