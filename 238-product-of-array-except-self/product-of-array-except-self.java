class Solution {

    public int[] productExceptSelf(int[] nums) {
      int n = nums.length;

        // Arrays to store the product of elements to the left and right of each element
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];

        // Initialize the leftProducts array
        leftProducts[0] = 1;
        
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }

        // Initialize the rightProducts array
        rightProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }

        // Calculate the final result array
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }

        return result;
    }
}