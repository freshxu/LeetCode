
class Solution {
	fun lengthOfLastWord(s: String): Int {
    	val str = s.trim()
    	if (str.length == 0) return 0
    	try {
        	return (str.length - 1 - str.indexOfLast { it == ' ' })
    	} catch(e: Exception) {
        	return str.length
    	}
	}
}
