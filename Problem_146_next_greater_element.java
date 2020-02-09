class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
        Stack<Integer> s=new Stack<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            while(!s.isEmpty() && nums2[i]>s.peek())
            {
                int rv=s.pop();
                hm.put(rv,nums2[i]);
            }
            s.push(nums2[i]);
        }
        while(!s.isEmpty()){
            hm.put(s.pop(),-1);
        }
        int ans[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            ans[i]=hm.get(nums1[i]);
        }
        return ans;
    }
}