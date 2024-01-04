class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int n = nums.length;

        if(k<0)
        {
            k= k+nums.length;
        }

       revNum(nums,0,n-k-1);

       revNum(nums,n-k,n-1);

       revNum(nums,0,n-1);
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