class Solution {
    public void duplicateZeros(int[] arr) {
        int length = arr.length;
        int[] res = new int[length];
        int j = 0;
        
        for (int i = 0; i < length && j < length; i++){
            if (arr[i] != 0){
                res[j] = arr[i];
            } else {
                j++;
            }
            j++;
        }
        
        for (int i = 0; i < length; i++){
            arr[i] = res[i];
        }
    }
}