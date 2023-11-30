class Solution {

    public int countNegatives(int[][] grid) {
     int count =0;
     int rows = grid.length;
     int col = grid[0].length;

     System.out.println("rows are:"+rows);
     System.out.println("col are :"+col);

     for(int i=0;i<rows;i++)
     {
         for(int j=0;j<col;j++)
         {
           if(grid[i][j]<0)
           {
              count++; 
           }
         } 
     }
     
     return count;
    }
}