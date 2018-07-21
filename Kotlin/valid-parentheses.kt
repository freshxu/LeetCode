class Solution {
    fun isValid(s: String): Boolean {
        if (s.length == 0) return true
        if (s.length % 2 != 0) return false
        val start = s[0]
        if (start == ')' || start == '}' || start == ']') return false
        val list = mutableListOf<Char>()
        for (i in 0 until s.length) {
            if (s[i] == '(' || s[i] == '{' || s[i] == '[') {
                list.add(s[i])
            } else {
                if (isMatch(list.get(list.size - 1),s[i])) {
                    list.removeAt(list.size - 1)
                } else {
                    return false
                }
            }
        }
        return list.size == 0
    }
    
    fun isMatch(c1: Char, c2: Char): Boolean {
        return ((c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}'))
    }
}