class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         if(candidates.length==0)
        {
            return null;
        }
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> combination=new ArrayList<>();
        ans(candidates,0,target,result,combination);
        return result; 
        
    }
     void ans(int arr[],int index,int target,List<List<Integer>> result,List<Integer> combination)
    {
        if(target==0)
        {
            ArrayList ll=new ArrayList<>(combination);
            Collections.sort(ll);
            if(!result.contains(ll))
            {
                  result.add(ll);  
                  
            }
        return;
        }
        for(int i=index;i<arr.length;i++)
        {
            if(target-arr[i]>=0)
            {
                combination.add(arr[i]);
                ans(arr,i+1,target-arr[i],result,combination);
                combination.remove(combination.size()-1);
            }
        }
    }
}