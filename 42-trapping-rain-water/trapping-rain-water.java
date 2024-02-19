class Solution {

    public int trap(int[] height) {
      int trappedWater =0;
      int n = height.length;
      int left[] = new int[n];  
      int right[] = new int[n];

      // Left max building by looking from left side
      // At 0 index nothing at left side hence assign height[0]
      left[0] = height[0];
       
       for(int i=1;i<n;i++)
       {
           left[i] = Math.max(left[i-1],height[i]); 
       }

       //Nothing is there to compare at right side hence assign height[n-1]

       right[n-1] = height[n-1];

       for(int i =n-2 ;i>=0;i--)
       {
        right[i] =  Math.max(right[i+1],height[i]);
       }

       for(int i=0;i<n;i++)
       {
         trappedWater += Math.min(right[i],left[i])-height[i];
       }

       return trappedWater;
    }
}