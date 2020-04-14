class Solution {
    private String fun_left(String s,int diff)
    {
        int n=s.length();
        int x=diff%n;
        return s.substring(x)+s.substring(0,x);
    }
    private String fun_right(String s,int diff)
    {
        int n=s.length();
        int x=diff%n; 
        return s.substring(x,n)+s.substring(0,x);

    }
    
    public String stringShift(String s, int[][] shift) {
        int n=shift.length;
        int m=2;
        int left_shift=0;
        int right_shift=0;
        for(int i=0;i<n;i++)
        {
             if(shift[i][0]==0)
             {
                 left_shift+=shift[i][1];
             }
            else
            {
                right_shift+=shift[i][1];
            }
        }
        int diff=left_shift-right_shift;
        return diff>=0?fun_left(s,diff):fun_right(s,-diff);
        
    }
}