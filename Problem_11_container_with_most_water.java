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

class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int area=0;
        while(i<j)
        {
            area=Math.max(area,Math.min(height[i],height[j])*(j-i));
            if(height[i]<height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
            
        }
        return area;
        
    }
}

