class Solution {
    public static boolean check(Character s,Stack<Character> st)
    {
        if(s=='}' && st.peek()=='{')
        {
            st.pop();
            return true;
        }
        else if(s==')' && st.peek()=='(')
        {
            st.pop();
            return true;
        }
        else if(s==']' && st.peek()=='[')
        {
            st.pop();
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            {
                st.push(s.charAt(i));
            }
            else
            {
                      if(st.isEmpty() || !check(s.charAt(i),st))
                    {
                        return false;
                    }
                
              
            }
        }
        if(!st.isEmpty())
        {
            return false;
        }
        return true;
        
    }
}