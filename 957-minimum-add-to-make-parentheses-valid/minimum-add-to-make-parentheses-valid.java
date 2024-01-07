class Solution {

    public int minAddToMakeValid(String s) {
      Stack<Character> stack = new Stack<>();

      for(int i=0;i<s.length();i++)
      {
         if(s.charAt(i)==')')
         {
            /*If opposite bracket is there and stack is not empty   pop it  */
            if(!stack.isEmpty() && stack.peek()=='(' )
            {
               stack.pop();
            }else
            {
              /* If stack is empty or top element is not equal to '('
               */  
              stack.push(s.charAt(i));
            }

         }else
         {
          // If we have opening bracket push it to stack   
            stack.push(s.charAt(i));
         }
      }  
      //return the size of stack we will have bracket which are not matching 
      return stack.size();
    }
}