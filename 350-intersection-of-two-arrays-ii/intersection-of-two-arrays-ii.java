class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
     List<Integer> list = new ArrayList<>();

     int i=0;
     int j=0;

     Arrays.sort(nums1);
     Arrays.sort(nums2);

     while(i<nums1.length && j <nums2.length)
     {
         if(nums1[i]==nums2[j])
         {
            list.add(nums1[i]); 
           i++;
           j++;
         }
         else if(nums1[i]>nums2[j])
         {
             j++;
         }else
         {
             i++;
         }
     }

    System.out.println("List is :"+list);

     int size = list.size();
     int arr[] = new int[size];
     int k=0;

     while(k<size)
     {
       arr[k] = list.get(k);
       k++;
     }
     
     return arr;
    }
}
