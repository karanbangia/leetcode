class Solution {
	public int threeSumClosest(int[] nums, int target) {
		int n=nums.length;
		Arrays.sort(nums);
		List<List<Integer>> ans=new ArrayList<>();
		int min_dist=Integer.MAX_VALUE;
		int ans=0;
		for(int i=0;i<n-2;i++)
		{
				int low=i+1;
				int high=n-1;
				int sum=target-nums[i];
				while(low<high)
				{
					if(nums[low]+nums[high]-sum==0)
					{
						return target;
					}
					else if(nums[low]+nums[high]>sum)
					{
						if(nums[low]+nums[high]-sum<min_dist)
						{
							min_dist=Math.min(min_dist,nums[low]+nums[high]-sum);
							ans=nums[low]+nums[high]+nums[i];
						}
						high--;
					}
					else
					{
						if(sum-nums[low]-nums[high]<min_dist)
						{
							min_dist=Math.min(min_dist,sum-nums[low]-nums[high]);
							ans=nums[low]+nums[high]+nums[i];
						}
						low++;
					}

				}
				return ans;
			
		}


	}
}