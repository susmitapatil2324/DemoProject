class Solution {

    public int[] runningSum(int[] nums) {
      int result[] = new int[nums.length];   
      int totalSum =0;

      for(int i=0;i<nums.length;i++)
      {
        totalSum = totalSum+nums[i];
        result[i] = totalSum;
        System.out.println("TotalSum is:"+totalSum);
      }
     return result;
    }
}