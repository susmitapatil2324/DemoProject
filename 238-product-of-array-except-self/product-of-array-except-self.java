class Solution {

    public int[] productExceptSelf(int[] nums) {
      int n = nums.length;  
      int result[] = new int[n];  

      int leftSum[] = new int[n];
      int rightSum[] = new int[n];

      leftSum[0] = 1;

      for(int i=1;i<n;i++)
      {
        leftSum[i] = leftSum[i-1]*nums[i-1];
      }

      rightSum[n-1] =1;

      for(int i =n-2;i>=0;i--)
      {
         rightSum[i] = rightSum[i+1] * nums[i+1]; 
      }

      for(int i=0;i<n;i++)
      {
          result[i] = leftSum[i]*rightSum[i];
      }


      return result;
    }
}