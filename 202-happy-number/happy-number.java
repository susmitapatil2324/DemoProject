class Solution {

     // Main function to check if a number is happy
    public boolean isHappy(int n) {
       // Set to keep track of seen numbers
        HashSet<Integer> seenNumbers = new HashSet<>();

        // Continue the process until n becomes 1 or we encounter a cycle
        while (n != 1 && !seenNumbers.contains(n)) {
            seenNumbers.add(n);
            n = getSquareSum(n);
        }

        // If n is 1, it's a happy number; otherwise, it's not
        return n == 1;
    }

    private static int getSquareSum(int n) {
        int result = 0;
        while (n > 0) {
            int digit = n % 10;
            result += digit * digit;
            n /= 10;
        }
        return result;
    }

   
}