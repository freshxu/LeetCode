class Solution {
    public String countAndSay(int n) {  
        int i = 1;
        String result = "1";
        while (i < n) {
            result = getNext(result);
            i++;
        }
        return result;
    }
    public String getNext(String str) {
        char[] chars = str.toCharArray();
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                count++;
            } else {
                sb.append(count + String.valueOf(chars[i - 1]));
                count = 1;
            }
        }
        sb.append(count + String.valueOf(chars[chars.length - 1]));
        return sb.toString();
    }
}
