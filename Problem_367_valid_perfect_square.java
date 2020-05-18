class Solution {
    public boolean isPerfectSquare(int num) {
        int x=num%10;
        if(x==2 || x==3 || x==7 || x==8)return false;
        
        long l=1;
        long r=num;
        while(l<=r)
        {
            long mid=l+(r-l)/2;
            long sq=mid*mid;
            if(sq==num)
            {
                return true;
            }
            else if(sq<num)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return false;
        
    }
}