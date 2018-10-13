class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] m = magazine.toCharArray();
        char[] r = ransomNote.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : m) {
            if (map.containsKey(c)) {
                int num = map.get(c) + 1;
                map.put(c, num);
            } else {
                map.put(c, 1);
            }
        }
        for (char c : r) {
            if (map.containsKey(c)) {
                int num = map.get(c) - 1;
                if (num < 0)
                    return false;
                map.put(c, num);
            } else
                return false;
        }
        return true;
    }
}
