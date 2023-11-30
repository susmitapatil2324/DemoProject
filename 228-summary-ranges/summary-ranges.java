class Solution {

    public List<String> summaryRanges(int[] nums) {
       List<String> list = new ArrayList<>();

       for(int i=0;i<nums.length;i++)
       {
           int start = nums[i];

           while(i<nums.length-1 && nums[i]+1 ==nums[i+1])
           {
              i++;
           }

           if(start!=nums[i])
           {
            String result1 = String.valueOf(start)+"->"+String.valueOf(nums[i]);
            list.add(result1);
           }else
           {
              String result2 = String.valueOf(start);
              list.add(result2);
           }
       }
      return list;
    }

}