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

     for(int num : nums) {
         System.out.println("nums is:"+num);
            xorArray ^= num;
     }

    System.out.println("xorArray is :"+xorArray);

    System.out.println("Sub is :"+(xorAll^xorArray));

    return xorAll^xorArray;
    }
}