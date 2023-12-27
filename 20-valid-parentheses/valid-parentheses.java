class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        
        for(char ch : s.toCharArray())
        {
             switch(ch)
             {
                 case '(','{','[' -> stack.push(ch);
                 case ')' -> {
                     if(stack.isEmpty() || stack.pop()!='(' )
                     {
                         return false;
                     }

                 }   
                  case '}' -> {
                      if(stack.isEmpty() || stack.pop()!='{' )
                     {
                         return false;
                     }
                 }   
                  case ']' -> {
                       if(stack.isEmpty() || stack.pop()!='[' )
                     {
                         return false;
                     }
                 }


             }

        }
        return stack.isEmpty();
    }
}