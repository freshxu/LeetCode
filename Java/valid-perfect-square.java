class Solution {
    public boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num / 2 + 1;
        long res = 0;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            res = mid * mid;
            if (res == num) return true;
            if (res > num) end = mid - 1;
            if (res < num) start = mid + 1;
        }
        return false;
    }
}
