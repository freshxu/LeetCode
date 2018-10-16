class Solution {
   public int findNthDigit(int n) {
        int len = 1;
        long num = 9, start = 0;
        while (n > num * len) {
            n -= len * num;
            start += num;
            len++;
            num *= 10;
        }
        int res;
        if (n % len == 0) {
            res = ("" + (start + n / len)).charAt(len - 1) - '0';
        } else {
            res = ("" + (start + n / len + 1)).charAt(n % len - 1) - '0';
        }
        return res;
    }
}
