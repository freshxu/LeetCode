class Solution {
    fun climbStairs(n: Int): Int {
        if (n == 1) return 1
        if (n == 2) return 2
        var n1 = 1
        var n2 = 2
        for (i in 3..n) {
            var temp = n2
            n2 = n1 + n2
            n1 = n2
        }
        return n2
    }
}

