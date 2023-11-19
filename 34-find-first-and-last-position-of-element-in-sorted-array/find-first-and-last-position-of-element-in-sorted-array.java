class Solution {

    public int[] searchRange(int[] nums, int target) {
       int result[] = new int[2];

       for(int i=0;i<result.length;i++)
       {
           result[i] =-1;
       } 

       for(int i=0;i<nums.length;i++)
       {
          if(target==nums[i])
          {
              result[1] = i;
          }
       }

       for(int i=nums.length-1;i>=0;i--)
       {
         if(target==nums[i])
          {
              result[0] = i;
          }
       }
       return result;
    }
}