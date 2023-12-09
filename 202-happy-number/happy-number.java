class Solution {

     // Main function to check if a number is happy
    public boolean isHappy(int n) {
      Set<Integer> set = new HashSet<>();

      while(n!=0 && !set.contains(n))
      {
        set.add(n);  
        n = getSquareSum(n);
      }
      return n==1;
    }

   public static int getSquareSum(int n)
   {
      int result =0;

      while(n >0)
      {
        int digit = n%10;
        result+= digit*digit;
        n/=10;
      }

      return result;
   }
  
}