class Solution {
    public int minAddToMakeValid(String s) {
        int openCount = 0;  // Number of open parentheses needed
        int closeCount = 0; // Number of close parentheses needed

        for (char c : s.toCharArray()) {
            if (c == '(') {
                openCount++;
            } else if (c == ')' && openCount > 0) {
                openCount--;
            } else {
                closeCount++;
            }
        }

        return openCount + closeCount;
    }
}