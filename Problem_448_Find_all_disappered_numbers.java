class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       HashSet<Integer> hs=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            hs.add(nums[i]);
        }
        List<Integer> al=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(!hs.contains(i))
            {
                al.add(i);
            }
        }
        return al;
    }
}