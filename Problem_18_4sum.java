class Solution {

  public List<List<Integer>> fourSum(int[] nums, int target) {
    int n=nums.length;
    Arrays.sort(nums);
    List<List<Integer>> ans=new ArrayList<>();
    for(int i=0;i<n;i++)
    {
          //last ke 3 chhodne hai issliye n-2 limiting haii
        for(int j=i+1;j<n;j++)
        {
               int low=j+1;
               int high=n-1;
               int sum=target-nums[i]-nums[j];
               while(low<high)
               {
                      //two-pointer approach
                  if(nums[low]+nums[high]==sum)
                  {
                    if(!ans.contains(Arrays.asList(nums[i],nums[j],nums[low],nums[high])))
                    {
                     ans.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high])); 
                    }
                    
                    low++;
                    high--;
                  }
                  else if(nums[low]+nums[high]>sum)
                  {
                   high--;
                  }
                 else
                  {
                  low++;
                  }
               }

       }
     }
return ans;
}
}
