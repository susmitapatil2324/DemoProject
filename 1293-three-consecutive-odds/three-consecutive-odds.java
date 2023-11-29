class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(count==0&& arr[i]%2!=0){
                count++;
            }
            else if(count==1&& arr[i]%2!=0){
                count++;
            }
            else if(count==2&& arr[i]%2!=0){
                return true;
            }
            else if(arr[i]%2==0){
                count=0;
            }
        }
        return false;
    }
}