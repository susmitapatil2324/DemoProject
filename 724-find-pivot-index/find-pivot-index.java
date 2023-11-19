class Solution {

    public int pivotIndex(int[] nums) {
      int leftSum =0;
      int rightSum=0;

      for(int i=0;i<nums.length;i++)
      {  
          leftSum=0;
          for(int j=0;j<i;j++)
          {
             leftSum +=nums[j];
          }
          
          rightSum=0;
          for(int j =i+1;j<nums.length;j++)
          {
            rightSum+=nums[j];
          }

          if(leftSum==rightSum)
          {
              return i;
          }
      }
      return -1;
    }
}