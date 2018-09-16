class Solution {
    public int addDigits(int num) {
        int sum = getSum(num);
        while (sum >= 10) {
            sum = getSum(sum);
        }
        return sum;
    }
    
    public int getSum(int num) {
        int sum = 0;
        String value = String.valueOf(num);
        for (char c : value.toCharArray()) {
            sum += c - '0';
        }
        return sum;
    }
}
