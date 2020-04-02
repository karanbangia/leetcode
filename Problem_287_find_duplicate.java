class Solution {
    public int findDuplicate(int[] nums) {
        int x[]=nums;
        Arrays.sort(x);
        for(int i=1;i<x.length;i++)
        {
            if(x[i]==x[i-1])
            {
                return x[i];
                
            }
        }
        return -1;
    }
}