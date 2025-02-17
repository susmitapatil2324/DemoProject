class Solution {
    
    public int lengthOfLongestSubstring(String s) {
        /* We are using two pointer here. if there is unique char will move our 
           right pointer. if there is repeated char present in that case will move our
           left pointer.

           if you are confuse check this video on youtube:
           https://www.youtube.com/watch?v=jHj13UHURr8
        */
       int left =0;
       int maxLength =0;

       Set<Character> set = new HashSet<>(); 

       for(int right=0;right<s.length();right++){

           while(set.contains(s.charAt(right)))
           {
             set.remove(s.charAt(left));
             left++;
           }
          set.add(s.charAt(right));
          maxLength = Math.max(maxLength ,(right-left+1));
       }
     return maxLength;
    }
}