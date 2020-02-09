class MinStack {
    
    Stack<Integer> s;
    int min;
    public MinStack() {
        s=new Stack<>();
        min=Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        s.push(x);
        min=Math.min(x,min);
        
    }
    
    public void pop() {
      int x = s.pop();
      min=Integer.MAX_VALUE;
      for(Integer xy:s)
      {
          min=Math.min(min,xy);
      }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */