class Solution {
    
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums1.length;i++)
        {
          map.put(nums1[i],i);
        }

        for(int i =0;i<nums2.length;i++)
        {
            if(map.containsKey(nums2[i]))
            {
              list.add(nums2[i]);
              map.remove(nums2[i]);
            }
        }

        int arr[] = new int[list.size()];
        
        for(int i=0;i<arr.length;i++)
        {
          arr[i] = list.get(i);
        }

        return arr;
    }
}