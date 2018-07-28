class Solution {
    fun countAndSay(n: Int): String {
        var i = 1
        var result = ""
        while (i <= n) {
            result = getNext(result)
            i++
        }
        return result
    }
    fun getNext(str: String): String {
        var count = 1
        var result = ""
        for (i in 1 until str.length) {
            if (str[i] == str[i - 1]) {
                count++
            } else {
                result = result + count + str[i - 1]
                count = 1
            }
        }
        result = result + count + str.last()
        return result
    }
}
