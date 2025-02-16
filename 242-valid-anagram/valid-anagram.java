class Solution {

    public boolean isAnagram(String s, String t) {
      char firstArray[] =  s.toCharArray();
      char secondArray[] = t.toCharArray();

      Arrays.sort(firstArray);
      Arrays.sort(secondArray);

      return Arrays.equals(firstArray,secondArray);
    }
}