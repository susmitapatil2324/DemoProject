class Solution {

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int k=n;
        int result [] = new int[2*n];
        int nextGreater []= new int[n];

        for(int i=0;i<n;i++)
        {
          result[i] = nums[i];
        }
        
        for(int i=0;i<n;i++)
        {
          result[k] = nums[i];
          k++; 
        }
       
       for(int i=0;i<nums.length;i++)
       {
           int no = nums[i];

           for(int j=i+1;j<result.length;j++)
           {
             if(no<result[j])
             {
               nextGreater[i] = result[j];
               break;
             }else
             {
                 nextGreater[i] = -1;
             }
           }
       }
        return nextGreater;
    }
}