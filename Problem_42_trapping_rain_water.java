class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if(n==0)return 0;
        int left[]=new int[n];
        int right[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(i==0)left[0]=height[0];
            else left[i]=Math.max(height[i],left[i-1]);
        }
        for(int i=n-1;i>=0;i--)
        {
            if(i==n-1)right[n-1]=height[n-1];
            else right[i]=Math.max(height[i],right[i+1]);
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans+=Math.min(left[i],right[i])-height[i];
        }
        return ans;
        
    }
}