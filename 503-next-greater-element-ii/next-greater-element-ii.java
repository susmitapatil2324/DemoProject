class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        Stack<Integer> stack=new Stack<>();

        // Push all the element in the stack
    for(int i=nums.length-1;i>=0;i--){
            stack.push(nums[i]);
     }
        
        //Check one by one in stack any greater element is there
    for(int i=nums.length-1;i>=0;i--){
        int number=nums[i];

        while(stack.size()!=0 && stack.peek()<=nums[i]){
                    stack.pop();
        }
           
            nums[i]=stack.empty()?-1:stack.peek();
            stack.push(number);
        }
        
        return nums;
    }
}