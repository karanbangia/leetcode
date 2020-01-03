class Solution {
    public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> ll=new ArrayList<>();
        permutation(num,0,num.length-1,ll);
        return ll;
    }
    void permutation(int []num,int l,int r, List<List<Integer>> ll)
    {
        if(l>r)
        {
            return ;
        }
        if(l==r)
        {
           ArrayList<Integer> al=new ArrayList<>();
           for(int i=0;i<=r;i++)
           {
               al.add(num[i]);
           }
            ll.add(al);
               
        }
     
              for(int i=l;i<=r;i++)
            {
                swap(num,i,l);
                permutation(num,l+1,r,ll);
                swap(num,i,l);
            }
            
      
    }
    void swap(int num[],int i,int l)
    {
        int temp=num[i];
        num[i]=num[l];
        num[l]=temp;
    }
}