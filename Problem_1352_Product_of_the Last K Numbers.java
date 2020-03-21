1352. Product of the Last K Numbersclass ProductOfNumbers {

    List<Integer> ll;
    public ProductOfNumbers() {
        ll=new ArrayList<>();
    }
    
    public void add(int num) {
        if(num==0)ll=new ArrayList<>();
        else
        {
            ll.add(ll.size()==0?num:ll.get(ll.size()-1)*num);
        }
    }
    
    public int getProduct(int k) {
       if(k>ll.size())return 0;
        if(k==ll.size())return ll.get(ll.size()-1);
        return ll.get(ll.size()-1)/ll.get(ll.size()-1-k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */