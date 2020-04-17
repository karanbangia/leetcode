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
    public int findIslands(char mat[][], int N, int M)
    {
        
         boolean isVisited[][]=new boolean[N][M];
         int count=0;
         for(int i=0;i<N;i++)
         {
             for(int j=0;j<M;j++)
             {
                 if(!isVisited[i][j] && mat[i][j]=='1')
                 {
                    isVisited[i][j]=true;
                    dfs(mat,isVisited,i,j,N,M); 
                    count++;
                 }
             }
         }
         return count;     
    }
	 public void dfs(char mat[][],boolean isVisited[][],int a,int b,int N,int M)
    {
        int count=0;
        Stack<point> s=new Stack<>();
        s.push(new point(a,b));
        while(!s.isEmpty())
        {
            point rv=s.pop();
            int i=rv.x;
            int j=rv.y;
            traverseNodes(mat,isVisited,i,j,N,M,s);
           	
        }
      
    }
  
    public void traverseNodes(char mat[][],boolean isVisited[][],int a,int b,int N,int M,Stack<point> s)
	{

		if(isAllowed(a+1,b,N,M))
			{
				if(!isVisited[a+1][b] && mat[a+1][b]!='0')
				{
					
					isVisited[a+1][b]=true;
					s.push(new point(a+1,b));
					
				}
			}
			if(isAllowed(a,b+1,N,M))
			{
				if(!isVisited[a][b+1] && mat[a][b+1]!='0')
				{
					
					isVisited[a][b+1]=true;
					s.push(new point(a,b+1));
					
				}
			}
			if(isAllowed(a,b-1,N,M))
			{
				if(!isVisited[a][b-1] && mat[a][b-1]!='0')
				{
					
					isVisited[a][b-1]=true;
					s.push(new point(a,b-1));
					
				}
			}
			if(isAllowed(a-1,b,N,M))
			{
				if(!isVisited[a-1][b] && mat[a-1][b]!='0')
				{
					
					isVisited[a-1][b]=true;
					s.push(new point(a-1,b));
					
				}
			}
// 			if(isAllowed(a-1,b-1,N,M))
// 			{
// 				if(!isVisited[a-1][b-1] && mat[a-1][b-1]!='0')
// 				{
					
// 					isVisited[a-1][b-1]=true;
// 					s.push(new point(a-1,b-1));
					
// 				}
// 			}
// 				if(isAllowed(a+1,b+1,N,M))
// 			{
// 				if(!isVisited[a+1][b+1] && mat[a+1][b+1]!='0')
// 				{
					
// 					isVisited[a+1][b+1]=true;
// 					s.push(new point(a+1,b+1));
					
// 				}
// 			}

	}
    public boolean isAllowed(int x,int y,int N,int M)
    {

        return (x>=0 && x<N && y>=0 && y<M)?true:false;
    }
    public int numIslands(char[][] grid) {
        
        int n=grid.length;
        if(n==0)return 0;
        int m=grid[0].length;
        if(n==0 && m==0)return 0;
       return findIslands(grid,n,m);
        
    }
}