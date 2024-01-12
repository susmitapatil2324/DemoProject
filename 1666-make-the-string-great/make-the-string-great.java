class Solution {
    public String makeGood(String s) {
       Stack<Character> stack = new Stack<>();
       int n= s.length();
       char arr[] = s.toCharArray();
       String ans ="";

       if(n==1)
       {
           return s;
       }

       for(int i=0;i<s.length();i++)
       {
           if(stack.size()!=0 && (stack.peek()-arr[i]==32||
             stack.peek()-arr[i]==-32))
           {
             stack.pop();
           }else
           {
             stack.push(arr[i]);
           }
       }

       while(stack.size()!=0)
       {
          ans=stack.pop()+ans; 
       }
       return ans;
    }
}