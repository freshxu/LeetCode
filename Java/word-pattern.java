class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        HashMap<Character, String> map = new HashMap<Character, String>();
        HashSet<String> set = new HashSet<String>();
        if (words.length != pattern.length()) return false;
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(words[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(words[i])) return false;
                map.put(pattern.charAt(i), words[i]);
            }
        }
        return true;

    }
}
