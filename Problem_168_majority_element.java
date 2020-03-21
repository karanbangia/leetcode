//unoptimized solution
class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1)
        {
            return nums[0];
        }
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
       for(int i:nums)
       {
           if(hm.containsKey(i) && hm.get(i)+1>n/2)
           {
               return i;
           }
           else
           {
               hm.put(i,hm.getOrDefault(i,0)+1);
           }
       }
        return  0;
    }
}
//moore's voting algo
/* it works because hmesha 1 element zyaada hogaa...toh uska count>0 hoga islie */
class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1)
        {
            return nums[0];
        }
       int count=0;
        int cand=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(count==0)
            {
                count=1;
                cand=nums[i];
            }
            else
            {
                if(cand!=nums[i])
                {
                    count--;
                }
                else
                {
                    count++;
                }
            }
        }
        count=0;
        for(int i=0;i<n;i++)
        {
           if(nums[i]==cand)
           {
               count++;
           }
        }
        if(count>=n/2+1)
        {
            return cand;
        }
        else
        {
            return -1;
        }
    }
}