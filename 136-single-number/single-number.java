class Solution {

    public int singleNumber(int[] nums) {
     int xor = 0;

     for(int i=0;i<nums.length;i++)
     {
         //0^2 = 2 --> 2^2= 0 --> 0^1=1
       xor^=nums[i];
     }  
     
     return xor;
    }
}