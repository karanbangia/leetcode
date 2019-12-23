//first we reverse integer into float and then check the boundaries with integer max and min value 
class Solution {
    public int reverse(int x) {
        long reversed=0;
        while(x!=0)
        {
            
            reversed=reversed*10+x%10;
            x/=10;
         
        }
        if(reversed<Integer.MIN_VALUE || reversed>Integer.MAX_VALUE)
        {
            return 0;
        }
       
       else 
       {
           return (int)reversed;
        
       }
    }
}