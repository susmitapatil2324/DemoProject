class Solution {

    public int majorityElement(int[] nums) {
       // Brute Force Approch  
       int count =0;
       int halfLength = nums.length/2;

       for(int i=0;i<nums.length;i++)
       {
           count =0;
           for(int j=0;j<nums.length;j++)
           {
               if(nums[i]==nums[j])
               {
                 count++;
               }
           }

           if(count>halfLength)
           {
               return nums[i];
           }
       }

       return -1;
    }
    
}