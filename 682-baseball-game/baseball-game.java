class Solution {

    public int calPoints(String[] operations) {
      Stack<Integer> stack = new Stack<>();  
      int totalSum=0;

      for(int i=0;i<operations.length;i++)
      {
         if(operations[i].equals("C"))
         {
             if(!stack.isEmpty())
             {
               stack.pop();
             }
         }else if(operations[i].equals("D"))
         {
            if(!stack.isEmpty())
             {
                 stack.push(2*stack.peek());
             }
         }else if(operations[i].equals("+"))
         {
            
            if(stack.size()>=2)
             {
                 int first = stack.pop();
                 int second = stack.pop();
                  stack.push(second);
                  stack.push(first);
                 stack.push(first+second);
             }
         }else
         {
             stack.push(Integer.parseInt(operations[i]));
         }
      }

       while(stack.size()!=0)
         {
           totalSum+=stack.pop();
         }

     return totalSum;
    } 
}