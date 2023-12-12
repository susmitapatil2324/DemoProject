class Solution {
    
    public boolean isPowerOfTwo(int n) {
     //Binary Representation of 2 is 1 Bit by using this formula 8421
      if(n<=0)
      {
          return false;
      }  

      return ((n &(n-1))==0);
    }
}