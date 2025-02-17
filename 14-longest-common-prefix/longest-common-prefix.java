class Solution {

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String firstString = strs[0];
        String lastString = strs[strs.length-1];
        int i=0;

        for(int j=0;j<firstString.length() && j<lastString.length();j++)
        {
           if(firstString.charAt(i)==lastString.charAt(i)){
            i++;
          }else{
            break;
          }
        
        }
        return firstString.substring(0,i);
    }
}