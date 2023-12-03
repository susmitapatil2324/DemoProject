class Solution {

    public int thirdMax(int[] nums) {

      int n = nums.length;
      long firstMax = Long.MIN_VALUE;
      long secondMax = Long.MIN_VALUE;
      long thirdMax = Long.MIN_VALUE;

      if(n<=2)
      {
          return nums[n-1];
      }
     
      for(int i=0;i<n;i++)
      {
          if(firstMax<nums[i])
          {
           thirdMax  = secondMax;
           secondMax = firstMax;
           firstMax  = nums[i];
          }else if(secondMax<nums[i] && nums[i]<firstMax)
          {
            thirdMax  = secondMax;
           secondMax = nums[i];
          }else if(thirdMax<nums[i] && nums[i]<secondMax)
          {
            thirdMax= nums[i]; 
          }
      }

       if(thirdMax!= Long.MIN_VALUE)
       {
           return (int)thirdMax;
       }
      return (int)firstMax ;
    }
}