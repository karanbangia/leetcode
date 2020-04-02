import java.lang.*;
class Solution {
    public boolean isHappy(int n) {
      
        
        while(n!=89)
        {
            
            String s=Integer.toString(n);
            int a=0;
            for(int i=0;i<s.length();i++)
            {
                int k=Integer.parseInt(String.valueOf(s.charAt(i)))*Integer.parseInt(String.valueOf(s.charAt(i)));
                a+=k;
            }
            
            if(a==1)
            {
                return true;
            }
            n=a;
        }
        return false;
        
        
    }
}