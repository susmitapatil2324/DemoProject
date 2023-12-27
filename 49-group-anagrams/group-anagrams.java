class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character,Integer>,ArrayList<String>> bmap = new HashMap<>();
       
        for(String s:strs)
        {
           HashMap<Character,Integer> freMap = new HashMap<>();

            for(int i=0;i<s.length();i++)
            {
              freMap.put(s.charAt(i),freMap.getOrDefault(s.charAt(i),0)+1);
            }

         if(bmap.containsKey(freMap)==false)
         {
           ArrayList<String> list = new ArrayList<>();
            list.add(s);
            bmap.put(freMap,list);
         }else
         {
           ArrayList<String> list = bmap.get(freMap);
           list.add(s);
         }

        }

        List<List<String>> list = new ArrayList<>();

        for(List<String> ls:bmap.values())
        {
          list.add(ls);
        }
        return list;
    }
}