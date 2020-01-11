//this solution gives TLE
class point
{
    int x;
    int y;
    point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {
   public boolean isAllowed(int x,int y,int n,int m)
    {
        if(x>=0 && x<n && y>=0 && y<m)return true;
        return false;
    }
    public int uniquePathsWithObstacles(int[][] mat) {
        point p;
        int m=mat.length;
        int n=mat[0].length;
        if(mat[0][0]==1)return 0;
        if(mat[m-1][n-1]==1)return 0;
        boolean isVisited[][]=new boolean[m][n];
        isVisited[0][0]=true;
        Stack<point> s=new Stack<>();
        s.push(new point(0,0));
        return dfs(mat,isVisited,s,m,n);
    }
    public int dfs(int mat[][],boolean isVisited[][],Stack<point> s,int m,int n)
    {
        int count=0;
        while(!s.isEmpty())
        {
            point rv=s.pop();
            int i=rv.x;
            int j=rv.y;
            if(i==m-1 && j==n-1)
            {
                count++;
                isVisited[i][j]=false;
            }

            if(isAllowed(i+1,j,m,n) && !isVisited[i+1][j])
            {
                if(mat[i+1][j]!=1)
                {
                    isVisited[i+1][j]=true;
                    s.push(new point(i+1,j));
                }
            }
              if(isAllowed(i,j+1,m,n) && !isVisited[i][j+1])
            {
                if(mat[i][j+1]!=1)
                {
                    isVisited[i][j+1]=true;
                    s.push(new point(i,j+1));
                }
            }
            isVisited[i][j]=false;
            
            
        }
        return count;
    }
}
// optimized solution

class Solution {
    public int uniquePathsWithObstacles(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        if(mat[0][0]==1)return 0;
        if(mat[m-1][n-1]==1)return 0;
        int dp[][]=new int[m][n];
        dp[0][0]=1;
        for(int i=1;i<m;i++)
        {
            if(mat[i][0]==1)break;
            dp[i][0]=1;
        }
         for(int i=1;i<n;i++)
        {
          if(mat[0][i]==1)break;
          dp[0][i]=1;
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(mat[i][j]==0)
                {
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
                else
                {
                    dp[i][j]=0;
                }
            }
        }
        return dp[m-1][n-1];
    }
 
}