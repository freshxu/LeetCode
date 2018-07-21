class Solution {
    public boolean isValid(String s) {
        
        if (s.length() % 2 == 1) {
            return false;
        }
        if (s != null && s.length() == 0) {
            return true;
        }
        char start = s.charAt(0);
        char end = s.charAt(s.length() - 1);
        if (start == ')' || start == '}' || start == ']') {
            return false;
        }
        if (end == '(' || end == '{' || end == '[') {
            return false;
        }
        Deque<Character> stack = new ArrayDeque<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (isMatch(stack.peek(),ch)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public boolean isMatch(char c1, char c2) {
        if ((c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}')) {
            return true;
        } else {
            return false;
        }
    }
}