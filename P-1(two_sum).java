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
//         int flag=0;
//         int z[]=new int[2];
//         for(int i=0;i<nums.length;i++)
//         {
//             int a = target-nums[i];
//             for(int j=0;j<nums.length;j++)
//             {
//                 if (a==nums[j] && j!=i)
//                 {
                    
//                     z[0]=i;
//                     z[1]=j;    
//                     flag=1;
//                     break;
//                 }
//             }
//             if (flag==1)
//             {
//                 break;
//             }
           
//         }
//         return z;
         
    