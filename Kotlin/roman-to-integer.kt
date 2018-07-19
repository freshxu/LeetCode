class Solution {
    fun romanToInt(s: String): Int {
        val romanMap = mapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
        var result : Int = 0
        for (i in 0 until s.lastIndex) {
            if (romanMap.getValue(s[i]) >= romanMap.getValue(s[i + 1])) {
                result += romanMap.getValue(s[i])
            } else {
                result -= romanMap.getValue(s[i])
            }
        }
        result += romanMap.getValue(s[s.lastIndex])
        return result  
    }
}