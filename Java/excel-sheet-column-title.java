public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.insert(0, (char)((n - 1) % 26 + 'A'));
            n = (n - 1) / 26;
        }
        return sb.toString();
    }
