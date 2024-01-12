class Solution {

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int index=0;

        for(int i =0;i<first.length() && i<last.length();i++)
        {
           if(first.charAt(i)==last.charAt(i))
           {
             index++;
           }else
           {
               break;
           }
        }

        return first.substring(0,index);
    }
}