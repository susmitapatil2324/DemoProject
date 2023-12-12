class Solution {
    
    public boolean isPowerOfTwo(int n) {

     //Binary Representation of 2 is 1 Bit by using this formula 8421
     //If any number less than zero it is not power of two hence return false
      if(n<=0)
      {
          return false;
      }  

      return ((n &(n-1))==0);

      /* for n=8    1000  (n)
                    & 0111  (n - 1)
                   -----------
                    0000
         In this case it return true as 8 is power of 2             
        */
    }
}