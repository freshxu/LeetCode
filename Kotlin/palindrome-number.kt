class Solution {
    fun isPalindrome(x: Int): Boolean {
        var num = x
        if (num < 0) return false
        var reverse = 0 
        while (num != 0) {
            reverse = reverse * 10 + num % 10
            num /= 10
        }
        return x == reverse
    }
}

