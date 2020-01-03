class Solution {
    public List<List<Integer>> permuteUnique(int[] num) {
        HashSet<List<Integer>> hs=new HashSet<>();
        List<List<Integer>> ll=new ArrayList<>();
        permutation(num,0,num.length-1,hs);
        for(List<Integer> x:hs) 
        {
            ll.add(x);
        }
        return ll;
    }
      void swap(int num[],int i,int l)
    {
        int temp=num[i];
        num[i]=num[l];
        num[l]=temp;
    }
     void permutation(int []num,int l,int r, HashSet<List<Integer>> hs)
    {

        if(l==r)
        {
           ArrayList<Integer> al=new ArrayList<>();
           for(int i=0;i<=r;i++)
           {
               al.add(num[i]);
           }
            hs.add(al);
               
        }
        else
        {
           
              for(int i=l;i<=r;i++)
            {
                swap(num,i,l);
                permutation(num,l+1,r,hs);
                swap(num,i,l);
            }
            
        }
            
      
    }
    
}