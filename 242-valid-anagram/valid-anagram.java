class Solution {

    public boolean isAnagram(String s, String t) {
     Map<Character,Integer> map = new HashMap<>();

      if(s.length()!=t.length()){
        return false;
      }

      for(char ch : s.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
      }

      for(char tch: t.toCharArray()){
        map.put(tch,map.getOrDefault(tch,0)-1);

        if(map.get(tch)<0){
            return false;
        }
      }
     
      return true;
     }
}