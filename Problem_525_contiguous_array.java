class Solution {
    public int findMaxLength(int[] nums) {
     HashMap<Integer,Integer> hm=new HashMap<>();
     hm.put(0,-1);
     ///same logic as longest valid parenthesis
     int max_len=0;
     int count=0;
     for(int i=0;i<nums.length;i++)
     {
         if(nums[i]==0)count--;
         if(nums[i]==1)count++;
         if(hm.containsKey(count))
         {
             max_len=Math.max(max_len,i-hm.get(count));
             //graph upar neeche jaaega toh..ek jgh do baar ayega toh andar waala same hoga
         }
         else
         {
             hm.put(count,i);
         }
     }
        return max_len;
        
    }
}