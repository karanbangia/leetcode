/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
*/
//basic approach
//prefix sum appraoch
class Solution {
    public int maxSubArray(int[] arr) {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        if(n==1)
        {
            return arr[0];
        }
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,arr[i]);
        }
        int prefix[]=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
            max=Math.max(max,prefix[i]);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                max=Math.max(max,prefix[j]-prefix[i]);
            }
        }
        return max;
        
    }
}
//kadanes algo
class Solution {
    public int maxSubArray(int[] arr) {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,arr[i]);
        }
        if(max<=0)
        {
            return max;
        }
        int max_so_far=0;
        int ans=0;
        for(int i=0;i<n;i++)
        {
           if(max_so_far+arr[i]>0)
           {
               max_so_far=max_so_far+arr[i];
           }
            else
            {
                max_so_far=0;
            }
            ans=Math.max(ans,max_so_far);
        }
        return ans;
        
    }
}