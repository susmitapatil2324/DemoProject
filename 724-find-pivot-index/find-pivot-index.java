class Solution {

    public int pivotIndex(int[] nums) {
      int leftSum =0;
      int totalSum=0;

      for(int i=0;i<nums.length;i++)
      {
        totalSum+=nums[i];
        
      }

     System.out.println("TotalSum is :"+totalSum);

      for(int j=0;j<nums.length;j++)
      {
          totalSum -= nums[j];

          if(totalSum==leftSum) 
          {
              return j;
          }
       leftSum+=nums[j];
      }

      return -1;
    }
}