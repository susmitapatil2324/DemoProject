class Solution {

    public int missingNumber(int[] nums) {
     int n = nums.length;

     int xorAll =0;

     for(int i=1;i<=n;i++)
     {
         xorAll^= i;
     }

     System.out.println("xorAll is :"+xorAll);

     int xorArray= 0;
     for(int i=0;i<n;i++)
     {
       xorArray^=nums[i];
     }
    System.out.println("xorArray is :"+xorArray);

    System.out.println("Xor of two is :"+(xorAll^xorArray));

    return xorAll^xorArray;
    }
}