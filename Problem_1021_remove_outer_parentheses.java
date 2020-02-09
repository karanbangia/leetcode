class Solution {
    public String removeOuterParentheses(String s) {
     	int n = s.length();
			StringBuilder ans = new StringBuilder();
			Stack<Integer> st = new Stack<>();
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (s.charAt(i) == '(' && st.isEmpty()) {
					count = 0;
					count++;
					st.push(count);
				} else if (s.charAt(i) == '(') {
					count++;
					st.push(count);
					ans.append(s.charAt(i));
				} else {
					if (st.peek() != 1) {
						ans.append(s.charAt(i));
						st.pop();
					} else {
						st.pop();
					}
				}
			}
        return ans.toString();
    }
}