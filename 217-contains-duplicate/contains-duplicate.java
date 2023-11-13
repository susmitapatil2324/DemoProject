class Solution {
    public boolean containsDuplicate(int[] nums) {
     Map<Integer,Integer> map = new HashMap<>();

     for(int i=0;i<nums.length;i++)
     {
         if(map.containsKey(nums[i]))
         {
           int value = map.getOrDefault(nums[i],0);
           map.put(nums[i],value+1);
           return true;
         }else
         {
           map.put(nums[i],0);
         }
     }
     return false;
    }
}