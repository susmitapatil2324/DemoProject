class Solution {

    public int[] decode(int[] encoded, int first) {
         int n = encoded.length + 1; // The length of the original array

        // Initialize the result array with the first element
        int[] arr = new int[n];
        arr[0] = first;

        // Decode the array using XOR
        for (int i = 1; i < n; i++) {
            // Use the XOR property to find the next element in the original array
            arr[i] = arr[i - 1] ^ encoded[i - 1];
        }

        return arr;
    }
}