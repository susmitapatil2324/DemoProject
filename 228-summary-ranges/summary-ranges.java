class Solution {
    
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            int start= nums[i];

            while(i<nums.length-1 && nums[i+1]-nums[i]==1)
            {
               i++;
            }
           String result = getRanges(start,nums[i]);
           list.add(result);
        }
        return list;
    }

    public String getRanges(int to ,int from)
    {
        return (to==from)? String.valueOf(to):String.valueOf(to)+"->"+String.valueOf(from);
    }
}