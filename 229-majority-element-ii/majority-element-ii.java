class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int count =0;
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++)
        { 
            int value = map.getOrDefault(nums[i],0);
            map.put(nums[i],value+1);
        }

        for(Map.Entry<Integer,Integer> it:map.entrySet())
        {
           if(it.getValue()>(n/3))
           {
             list.add(it.getKey());
           }
        }
        return list;
    }
}