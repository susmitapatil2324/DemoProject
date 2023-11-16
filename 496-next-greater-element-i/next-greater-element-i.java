class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < len2; i++) {
            hm.put(nums2[i], i);
        }   

        int[] res = new int[len1];
        for(int i=0;i<len1;i++)
        res[i]=-1;

        for (int i = 0; i < len1; i++) {
            int num = nums1[i];
            int index = hm.get(num);
           
            for (int j = index + 1; j < len2; j++) {
                if (num < nums2[j]) {
                    res[i] = nums2[j];
                  
                    break;
                }
            }
        }
        return res;
    }
}