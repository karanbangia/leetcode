class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char r[]=ransomNote.toCharArray();
        char m[]=magazine.toCharArray();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char c:m)
          {
              hm.put(c,hm.getOrDefault(c,0)+1);
          }
        for(char c:r)
        {
            if(!hm.containsKey(c) || hm.get(c)<=0)return false;
            hm.put(c,hm.get(c)-1);
        }
        return true;
    }
}