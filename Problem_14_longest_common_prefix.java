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
//Divide and conquer method
public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) return "";    
        return longestCommonPrefix(strs, 0 , strs.length - 1);
}

private String longestCommonPrefix(String[] strs, int l, int r) {
    if (l == r) {
        return strs[l];
    }
    else {
        int mid = (l + r)/2;
        String lcpLeft =   longestCommonPrefix(strs, l , mid);
        String lcpRight =  longestCommonPrefix(strs, mid + 1,r);
        return commonPrefix(lcpLeft, lcpRight);
   }
}

String commonPrefix(String left,String right) {
    int min = Math.min(left.length(), right.length());       
    for (int i = 0; i < min; i++) {
        if ( left.charAt(i) != right.charAt(i) )
            return left.substring(0, i);
    }
    return left.substring(0, min);
}