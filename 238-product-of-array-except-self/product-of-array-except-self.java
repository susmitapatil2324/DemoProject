class Solution {

    public int[] productExceptSelf(int[] nums) {
      int n = nums.length;  
      int result[] = new int[n];  
      int prefixSum = 1;
      int sufixSum = 1;

      for(int i=0;i<n;i++)
      {
          if(i>0)
          {
            prefixSum *= nums[i-1];
          }
          result[i] = prefixSum;
      }

      for(int i=n-1;i>=0;i--)
      {
           if(i<n-1)
           {
             sufixSum*= nums[i+1];
           }
          result[i]*= sufixSum; 
      }
      return result;
    }
}