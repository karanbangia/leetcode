class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
        {
            return "";
        }
        if(strs.length==1)
        {
            return strs[0];
        }
        int index=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++)
        {
            if(strs[i].length()<min)
            {
                 min=Math.min(min,strs[i].length());
                 index=i;
            }
           
            
        }
        String ans="";
        for(int i=0;i<min;i++)
        {
            Character a=strs[index].charAt(i);
            for(int j=0;j<strs.length;j++)
            {
                if(a!=strs[j].charAt(i))
                {
                    return ans;
                }
                
            }
            ans+=Character.toString(a);
        }
        
        return ans;
        
        
    }
}