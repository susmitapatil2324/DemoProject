class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;

        if(k<0)
        {
            k= k+nums.length;
        }

       //Part-1
       revNum(nums,0,nums.length-k-1);

       //Part-2
       revNum(nums,nums.length-k,nums.length-1);

       //Part-3
       revNum(nums,0,nums.length-1);
    }

    public void revNum(int arr[],int i,int j)
    {
        while(i<j)
        {
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    
}