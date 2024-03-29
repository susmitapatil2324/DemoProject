class Solution {

    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();
        char arr[] = s.toCharArray();

        for(int i=0;i<arr.length;i++)
        {
          char ch = arr[i];

          switch(ch)
          {
            case '(','[','{':
                              stack.push(ch);
                              break;

            case ')' : 
                         if(stack.size()==0 || stack.pop()!='(')
                         {
                             return false;
                         } 
                         break;
            
            case ']' : 
                         if(stack.size()==0 || stack.pop()!='[')
                         {
                             return false;
                         } 
                          break;

            case '}' : 
                         if(stack.size()==0 || stack.pop()!='{')
                         {
                             return false;
                         }     
                          break;                                                                
          }
        }
       return stack.isEmpty();
    }
}