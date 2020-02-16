class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                st.push(i);
            }
            else
            {
                st.pop();
                if(!st.isEmpty())
                {
                    max=Math.max(max,i-st.peek());
                }
                else
                {
                    st.push(i);
                }
                
            }
        }
        if(max==Integer.MIN_VALUE)
        {
            return 0;
        }
        else
        {
                    return max;
        }

    }
}