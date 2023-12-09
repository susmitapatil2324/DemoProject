class Solution {

     // Main function to check if a number is happy
    public boolean isHappy(int n) {
     Set<Integer> set = new HashSet<>();

     while(n!=1 && !set.contains(n))
     {
        set.add(n);
        n =getSquareNumber(n);
     }
    return n==1;
    }

    public static int getSquareNumber(int n)
    {
         int result=0;
        while(n>0)
        {
          int no = n%10;
          result += no*no ;
          n/=10;
        }
      return result;  
    }
}