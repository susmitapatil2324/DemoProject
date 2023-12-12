class Solution {

    public int missingNumber(int[] nums) {
     int n = nums.length ; // Number of elements including the missing one

        // XOR all numbers from 1 to n
        int xorAll = 0;
        for (int i = 1; i <= n; i++) {
            xorAll ^= i;
        }

        // XOR all elements in the array
        int xorArray = 0;
        for (int num : nums) {
            xorArray ^= num;
        }

        // XOR the results to find the missing number
        return xorAll ^ xorArray;
    }
}