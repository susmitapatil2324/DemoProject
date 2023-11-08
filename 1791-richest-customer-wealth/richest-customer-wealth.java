class Solution {
    public int maximumWealth(int[][] accounts) {
         int wealth = 0;
         int row = accounts.length;
         int col = accounts[0].length;
         
         for(int i=0;i<row;i++)
         {
             int currentWealth = 0;
             for(int j=0;j<col;j++)
             {
                 currentWealth+= accounts[i][j];
             }
             if(currentWealth>wealth)
             {
                  wealth = currentWealth;
             }
         }
        return  wealth;
    }
}