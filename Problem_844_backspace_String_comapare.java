class Solution {
    private Stack<Character> utils(String s)
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='#') 
            {
                if(!st.isEmpty())st.pop();
            }
            else st.push(s.charAt(i));
        }
        return st;
    }
    public boolean backspaceCompare(String S, String T) {
        return utils(S).equals(utils(T))?true:false;
    }
}