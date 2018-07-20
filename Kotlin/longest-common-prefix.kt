class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.size == 0 || strs[0].length == 0) {
            return ""
        }
        for (i in 0 until strs[0].length) {
            for (j in 1 until strs.size) {
                if (strs[j].length < i + 1 || strs[0][i] != strs[j][i]) {
                    return strs[0].take(i)
                }
            }
        }
        return strs[0]
    }
}
