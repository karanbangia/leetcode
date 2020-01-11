class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dp[][]=new int[n][m];
        int sum=grid[0][0];
        dp[0][0]=sum;
        for(int i=1;i<n;i++)
        {
            sum+=grid[i][0];
            dp[i][0]=sum;
        }
        sum=grid[0][0];
         for(int i=1;i<m;i++)
        {
            sum+=grid[0][i];
            dp[0][i]=sum;
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                dp[i][j]=Math.min(grid[i][j]+dp[i-1][j],grid[i][j]+dp[i][j-1]);
            }
        }
       return dp[n-1][m-1];
           
    }
}