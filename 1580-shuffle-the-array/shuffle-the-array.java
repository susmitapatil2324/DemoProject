class Solution {

    public int[] shuffle(int[] nums, int n) {
       int len = nums.length; 
       int result[] = new int[len];
       int forword[] = new int[n];
       int backword[] = new int[n];
       int k =0;
       int f=0;
       int b=0;

       for(int i=0;i<n;i++)
       {
          forword[i] = nums[i]; //0,1,2
       }

       for(int j=n;j<len;j++)
       {
         backword[k] = nums[j];
         k++;
       }

       for(int i=0;i<len;i++)
       {
         if(i%2==0)
         {
          result[i]= forword[f];
          f++;
         }else
         {
           result[i]= backword[b];
           b++;
         }
       }
       
      return result;
    }
}