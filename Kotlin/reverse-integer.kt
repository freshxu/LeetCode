class Solution {
    fun reverse(x: Int): Int {
        var num = x
        if (num == 0) return 0
        var result : Int = 0
        while (num != 0) {
            val pop : Int = num % 10
            num /= 10
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) return 0
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) return 0
            result = result * 10 + pop
        }
        return result
    }
}
