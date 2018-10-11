class Solution {
    public int getSum(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        int sum, i;
        i = a ^ b;
        sum = (a & b) << 1;
        return getSum(sum, i);
    }
}
