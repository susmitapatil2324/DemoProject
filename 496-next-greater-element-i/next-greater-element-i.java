class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //Taking length of two array
        int len1 = nums1.length; 
        int len2 = nums2.length;

        //Created HashMap
        Map<Integer,Integer> map = new HashMap<>();

        //Created result array
        int result[] = new int[len1];

        for(int i=0;i<len1;i++)
        {
           result[i] = -1;
        }

        for(int i=0;i<len2;i++)
        {
            map.put(nums2[i],i);
        }

        for(int i=0;i<len1;i++)
        {
           int no = nums1[i];
           int index = map.get(no);

           for(int j =index+1;j<len2;j++)
           {
              if(no<nums2[j])
              {
                result[i] =nums2[j];
                break;
              }
           }
        }
       return result;
    }
}