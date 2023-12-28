public class Solution {

    public String longestPalindrome(String s) {  

      if(s.length()<=1)
      {
        return s;
      }
      String max = s.substring(0,1);


      for(int i=0;i<s.length()-1;i++)
      {
         
      String oddString = checkPalidrome(s,i,i);
      String evenString = checkPalidrome(s,i,i+1);

         if(oddString.length()> max.length())
         {
           max = oddString;
         }

         if(evenString.length()> max.length())
         {
           max = evenString;
         }
      }
     
     return max;
    }
    
    private String checkPalidrome(String s,int left,int right)
    {
        while((left>=0 && right<s.length()) && s.charAt(left)==s.charAt(right))
        {
             left--;
             right++;
        }
        return s.substring(left+1,right);
    }
    
}