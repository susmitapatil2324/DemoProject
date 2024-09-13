
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {

     List<String> ll=new ArrayList<>();
     for(String str: words) {
        String arr[]=str.split("\\Q" + separator + "\\E");
        for(String str1:arr) {
            if (!str1.isEmpty()) {
                ll.add(str1);
            }
        }
     }
     return ll;
    }
}