class Solution {
    public int[] replaceElements(int[] arr) {
        int result[] = new int[arr.length];
        int max = 0;
        
      
      for(int i= arr.length-1;i>=0;i--)
      {
           if(max<arr[i])
           {
              result[i] =max; 
              max= arr[i];
           }else
           {
            result[i] =max; 
           }
      }

      result[result.length-1] = -1;

    return result;
    }
}