class Solution {

    public int[] rowAndMaximumOnes(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int minIndex =0;
        int lastMaxOnes =0;

        for(int i=0;i<rows;i++)
        {
          int currentCount =0;

          for(int j=0;j<cols;j++)
          {
              currentCount += mat[i][j];  

              if(lastMaxOnes<currentCount)
              {
                lastMaxOnes = currentCount;
                minIndex = i;
              }
          }
        }

        return new int[]{minIndex,lastMaxOnes};
    }

}