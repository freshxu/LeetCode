class Solution {
    public boolean isPowerOfFour(int num) {
        if (num <= 0) return false;
        while (num != 1) {
            if (num % 4 != 0) {
                return false;
            } else {
                num /= 4;
            }
        }
        return true;
    }
}
