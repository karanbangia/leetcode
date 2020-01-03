//wrong solution but process important

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0) return new ArrayList<>();
        int n=strs.length;
        Map<Integer,List<String>> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=0;j<strs[i].length();j++)
            {
                sum+=(int)strs[i].charAt(j);
            }
             List<String> list = map.get(sum);
            if(list == null){
              list = new LinkedList<>();
              map.put(sum,list);
            }
            //very important 16-21
            list.add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
//
//right solution  simple method-- just sort it into character array then put it in hashmap
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0) return new ArrayList<>();
        int n=strs.length;
        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char a[]=strs[i].toCharArray();
            Arrays.sort(a);
            StringBuilder sb=new StringBuilder();
            for(char x:a)
            {
                sb.append(x);
            }
             List<String> list = map.get(sb.toString());
            if(list == null){
              list = new LinkedList<>();
              map.put(sb.toString(),list);
            }
            list.add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}