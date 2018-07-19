class Solution {
   
    public int romanToInt(String s) {

        HashMap<Character, Integer> romanMaps = new HashMap<>();
        romanMaps.put('A', 0);
        romanMaps.put('I', 1);
        romanMaps.put('V', 5);
        romanMaps.put('X', 10);
        romanMaps.put('L', 50);
        romanMaps.put('C', 100);
        romanMaps.put('D', 500);
        romanMaps.put('M', 1000);

        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char value = chars[i];
            if (i == chars.length - 1) {
                result += romanMaps.get(value);
                return result;
            } else {
                char value1 = chars[i + 1];
                if (romanMaps.get(value) >= romanMaps.get(value1)) {
                    result += romanMaps.get(value);
                } else {
                    result -= romanMaps.get(value);
                }
            }
        }
        return result;
    }
}