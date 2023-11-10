class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> list = new ArrayList<>();

      for(int i=0;i<numRows;i++)
      {
        List<Integer> tempList = getRow(i);
        list.add(tempList);
      }   
      return list;
    }

    public List<Integer> getRow(int row) {
        List<Integer> list = new ArrayList<>();
        long start=1;
        list.add((int)start);

        for(int i=0;i<row;i++)
        {
          start = start*(row-i);
          start = start/(i+1);
          list.add((int)start);
        }

        return list;
    }
}