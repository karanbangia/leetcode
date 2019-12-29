//basic o(n^2) solution
class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                ans=Math.max(ans,Math.min(height[i],height[j])*(j-i));
            }
        }
        return ans;
    }
}
//optimized solution
