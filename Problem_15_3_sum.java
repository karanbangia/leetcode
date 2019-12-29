  class Solution {
  
      public List<List<Integer>> threeSum(int[] nums) {
          int n=nums.length;
          Arrays.sort(nums);
          List<List<Integer>> ans=new ArrayList<>();
          for(int i=0;i<n-2;i++)
          {
            //last ke 3 chhodne hai issliye n-2 limiting haii
              if(i==0 ||(i>0 && nums[i]!=nums[i-1]))
              {
                  int low=i+1;
                  int high=n-1;
                  int sum=-nums[i];
                  while(low<high)
                  {
                    //two-pointer approach
                      if(nums[low]+nums[high]==sum)
                      {
                        ans.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        //to remove next same number  
                        while(low<high && nums[low]==nums[low+1])low++;
                        while(low<high && nums[high]==nums[high-1])high--;
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
                  
