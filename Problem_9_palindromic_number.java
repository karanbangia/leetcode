
//basic approach
class Solution {
    public boolean isPalindrome(int x) {
      String s=Integer.toString(x);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
}
//without converting to string

class Solution {
    public boolean isPalindrome(int x) {
     if(x==0)return true;
     if(x%10==0 && x!=0)return false;
     if(x<0)return false;
     int rev_num=0;
    while(x>rev_num)
    {
        rev_num=rev_num*10+x%10;
        x/=10;
    }
    return x==rev_num || x==rev_num/10;
        
    }
}