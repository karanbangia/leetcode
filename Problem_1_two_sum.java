
//two pass hash map solution
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for (int i=0;i<nums.length;i++)
        {
           int compliment=target-nums[i];
            if(map.containsKey(compliment) && map.get(compliment)!=i)
            {
                return new int[] {i,map.get(compliment)};
            }
        }
         throw new IllegalArgumentException("No two sum solution");
    }
}
//one pass hash map solution
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int compliment=target-nums[i];
            if(map.containsKey(compliment))
            {
                return int[]{map.get(compliment),i};
            }
            map.put(nums[i],i);
        }
       
         throw new IllegalArgumentException("No two sum solution");
    }
}

    