class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==0)
        {
            return ;
        }

        int nonZeroCount=0;

        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]!=0)
           {
             nums[nonZeroCount] =nums[i];
             nonZeroCount++;
           }
        }

        while(nonZeroCount<nums.length)
        {
           nums[nonZeroCount]=0;
           nonZeroCount++;;
        }
    }
}