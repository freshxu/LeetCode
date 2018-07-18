
// solution 1 by int convert to charArray 
class Solution {
    public boolean isPalindrome(int x) {
        char[] before = String.valueOf(x).toCharArray();
        char[] after = new char[before.length];
        for (int i = before.length - 1; i >= 0; i--) {
            after[before.length - 1 - i] = before[i];
        }
        return String.valueOf(before).equals(String.valueOf(after));
        
    }
}


// solution 2 
class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        if (x < 0 ) return false;
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return x == reverse;
    }
}