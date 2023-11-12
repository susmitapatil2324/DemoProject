class Solution {

    public int majorityElement(int[] nums) {
       // Better Approch  
       int n = nums.length;
       Map<Integer,Integer> map = new HashMap<>();

       for(int i=0;i<nums.length;i++)
       {
         int value = map.getOrDefault(nums[i],0);
         map.put(nums[i],value+1);
       }

       for( Map.Entry<Integer,Integer> it:map.entrySet())
       {
            if(it.getValue()>n/2)
            {
               return  it.getKey();
            }
       }
      return -1;
    }

 }
 