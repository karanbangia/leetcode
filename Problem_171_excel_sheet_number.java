class Solution {
    public int titleToNumber(String s) {
        int n=s.length();
    
        int x=0;
        int sum=0;
        for(int i=n-1;i>=0;i--)
        {
            sum+=Math.pow(26,x)*((int)(s.charAt(i)-'A')+1);
            x++;
        }
        return sum;
    }
}