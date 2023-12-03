class Solution {

    public int[] sortArrayByParityII(int[] nums) {
      int result[] = new int[nums.length];  
      int evencount= 0;
      int oddcount = 1;

      for(int i=0;i<nums.length;i++)
      {
          if(nums[i]%2==0)
          {
            result[evencount] = nums[i];
            evencount+=2;
          }else
          {
            result[oddcount] = nums[i];
            oddcount+=2;
          }
      }
      return result;
    }
}