class Solution {
    public void duplicateZeros(int[] arr) {
       int n = arr.length;
       int result[] = new int[arr.length];
       int j=0;

       for(int i=0;i<n && j<n;i++)
       {
          if(arr[i]!=0)
          {
            result[j] =arr[i];
          }else
          {
            j++;
          }
          j++;
       }

       for(int i=0;i<n;i++)
       {
         arr[i] =result[i];
       }
    }
}