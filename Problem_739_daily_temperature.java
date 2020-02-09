class Solution {
    public int[] dailyTemperatures(int[] T) {
        
        int n=T.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++)  
        {
           for(int j=i+1;j<n;j++)
           {
             if(T[j]-T[i]>0)   
             {
                 ans[i]=j-i;
                 break;
             }
           }
          
        }
        return ans;
        
    }
}