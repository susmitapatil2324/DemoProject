class Solution {
    
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
      
      if(nums==null || nums.length<2 || indexDiff<=0 || valueDiff<0 )
      {
          return false;
      }
      TreeSet<Long> treeset = new TreeSet<>();

      for(int i=0;i<nums.length;i++)
      {
          long currentValue = nums[i];
          
          Long floor = treeset.floor(currentValue);

          if(floor !=null && currentValue-floor <= valueDiff)
          {
              return true;
          }

          Long celling = treeset.ceiling(currentValue);

          if(celling !=null && celling-currentValue <= valueDiff)
          {
              return true;
          }

          treeset.add(currentValue);

          if(i>=indexDiff)
          {
              treeset.remove((long)nums[i-indexDiff]);          
          }
      }

      return false;
    }
}    