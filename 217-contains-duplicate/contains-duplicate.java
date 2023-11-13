class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> hashset = new HashSet<>();

       for(Integer i:nums)
       {
           if(hashset.contains(i))
            {
                return true;
            }else{
                hashset.add(i);
            }
       }
       return false;
    }
}