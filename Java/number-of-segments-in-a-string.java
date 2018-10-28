 class Solution {
        public int countSegments(String s) {
            if (s.equals("") || s == null)
                return 0;
            char[] letters = s.toCharArray();
            boolean preSpace = (letters[0] == ' ') ? true : false;
            boolean haveLetters = false;
            int count = 0;
            for (int i = 0; i < letters.length; i++) {
                if (letters[i] == ' ') {
                    if (!preSpace) {
                        count++;
                        preSpace = true;
                    }
                } else {
                    haveLetters = true;
                    preSpace = false;
                }
            }
            if (haveLetters && letters[s.length() - 1] != ' ')
                count++;
            return count;
        }
    }
    