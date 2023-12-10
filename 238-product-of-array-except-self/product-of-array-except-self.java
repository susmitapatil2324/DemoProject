class Solution {

    public int[] productExceptSelf(int[] nums) {
      int n = nums.length;  
      int result[] = new int[n];  

      //First Calculate PrefixProduct
      int prefixProduct=1;

      for(int i=0;i<n;i++)
      {
          if(i>0)
          {
            prefixProduct*=nums[i-1];
          }
             result[i] = prefixProduct;
      }
      
      //Second Calculate SufixProduct
      int sufixProduct=1;

      for(int i=n-1;i>=0;i--)
      {
         if(i<n-1)
         {
           sufixProduct *= nums[i+1]; 
         }
         result[i] *= sufixProduct;
      }
      return result;
    }
}