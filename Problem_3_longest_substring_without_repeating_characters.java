
//Approach 1 normal hashmap with time complexity
//two pointer approach
a b c  c
// output =3
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int max=0;
        int n=s.length();
        HashSet <Character> hs=new HashSet<>();
        while(j<n)
        {
            if(!hs.contains(s.charAt(j)))
            {
                hs.add(s.charAt(j));
                max=Math.max(max,hs.size());
                j++;
            }
            else
            {
                hs.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}
//apporach optimized 