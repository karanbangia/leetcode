class Solution {
    public boolean isSubsequence(String s, String t) {
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            int count=0;
            for(int j=k;j<t.length();j++)
            {
             if(s.charAt(i)==t.charAt(j))
             {
                 k=j+1;
                 count++;
                 break;
                 
             }
            }
            if(count==0)
            {
                return false;
            }
        }
        return true;
    }
}