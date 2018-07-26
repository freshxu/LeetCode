class Solution {
    fun strStr(haystack: String, needle: String): Int {
        if (needle.length == 0) return 0
        if (haystack.length < needle.length || haystack.length == 0) return -1
        for (i in 0 until (haystack.length - needle.length)) {
            var isSucceed = true
            for (j in needle.indices) {
                if (haystack[i + j] != needle[j]) {
                    isSucceed = false
                    break
                }
            }
            if (isSucceed) return i
        }
        return -1
    }
}
