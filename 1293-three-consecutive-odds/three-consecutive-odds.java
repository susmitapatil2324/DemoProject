class Solution {

    public boolean threeConsecutiveOdds(int[] arr) {
      int n = arr.length;
      int count =0;
      int j=0;

      for(int i=0;i<n-2;i++)
      {
         if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0 )
         {
           count =3;
         }
      }  

     if(count==3)
      {
       return true;
      }

      return false;
    }
}