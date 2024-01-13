class Solution {
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Stack<Integer> stack = new Stack<>();
       Map<Integer,Integer> map = new HashMap<>();
       int nextgre[] = new int[nums2.length];
       int result [] = new int[nums1.length];

       //Start travel from last index   
       for(int i=nums2.length-1;i>=0;i--)
       {
          while(stack.size()!=0 && stack.peek()<=nums2[i])
          {
            stack.pop();
          }

          if(stack.size()!=0)
          {
           nextgre[i] = stack.peek();
          }else
          {
             nextgre[i] = -1; 
          }

          stack.push(nums2[i]);
       }
        
        for(int i=0;i<nums2.length;i++)
        {
            map.put(nums2[i],nextgre[i]);
        }

        for(int i=0;i<nums1.length;i++)
        {
         result[i] = map.get(nums1[i]);
        }

      return result;
    }
}