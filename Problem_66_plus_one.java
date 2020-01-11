class Solution {
    public int[] plusOne(int[] digit) {
        List<Integer> l=new ArrayList<>();
        int n=digit.length;
        int carry=0;
        
        carry=(digit[n-1]+1)/10;
        digit[n-1]=(digit[n-1]+1)%10;
        l.add(digit[n-1]);
        for(int i=digit.length-2;i>=0;i--)
        {
            int x=digit[i]+carry;
            carry=x/10;
            digit[i]=x%10;
            l.add(digit[i]);
        }
        if(carry!=0)
        {
            l.add(carry);
        }
        Collections.reverse(l);
        int output[]=new int[l.size()];
        for(int i=0;i<l.size();i++)
        {
            output[i]=l.get(i);
        }
        return output;
        
}
}