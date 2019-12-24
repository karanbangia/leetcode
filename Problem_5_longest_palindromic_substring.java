class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==0)
        {
            return "";
        }
        int strt=0;
        int max_len=1;
        int low=0;
        int high=0;
        int n=s.length();
        for(int i=1;i<n;i++)
        {
            low=i-1;
            high=i;
            while(low>=0 && high<n && s.charAt(low)==s.charAt(high))
            {
                if(high-low+1>max_len)
                {
                   max_len=Math.max(max_len,high-low+1);
                   strt=low;
                }
                low--;
                high++;
                
            }
            low=i-1;
            high=i+1;
             while(low>=0 && high<n && s.charAt(low)==s.charAt(high))
            {
                if(high-low+1>max_len)
                {
                   max_len=Math.max(max_len,high-low+1);
                   strt=low;
                }
                low--;
                high++;
                
            }
        }
        return s.substring(strt,strt+max_len);
        
        
    }
}