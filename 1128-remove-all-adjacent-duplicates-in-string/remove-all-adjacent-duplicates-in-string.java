class Solution {

    public String removeDuplicates(String s) {
       Stack<Character> stack = new Stack<>();

       for(Character ch : s.toCharArray())
       {
         if(stack.size()!=0 && stack.peek()==ch)
         {
            stack.pop();
         }else
         {
         stack.push(ch);
         }
       }
       
       StringBuilder sb = new StringBuilder();

       for(int i=0;i<stack.size();i++)
       {
          sb.append(stack.get(i));
       }
       return sb.toString();
    }
}