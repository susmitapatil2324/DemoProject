class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[] = new int[2];
        result[0] = findFirstIndex(nums,target);
        result[1] = findLastIndex(nums,target);
        return result;
      }

   private int findFirstIndex(int[] nums, int target)
   {
     int left = 0;
     int right = nums.length-1;
     int ans =-1;

     while(left<=right)
     {
       int mid = left+(right-left)/2;

       if(target==nums[mid])
       {
          ans = mid;
          right= mid-1;
       }else if(target<nums[mid])
       {
         right = mid-1;
       }else
       {
         left = mid+1;
       }
     }
     return ans;
   }   
   
   private int findLastIndex(int[] nums, int target)
   {
       int left = 0;
       int right = nums.length-1;
       int ans =-1;

       while(left<=right)
       {
         int mid = left+(right-left)/2;

         if(target==nums[mid])
         {
          ans =mid;
          left =mid+1;
         }else if(nums[mid]<target)
         {
            left =mid+1;
         }else
         {
           right = mid-1;
         }
       }
       return ans;
   }
}