class Solution {
    public int findJudge(int N, int[][] trust) {
        HashMap<Integer,Integer> in=new HashMap<>();
        HashMap<Integer,Integer> out=new HashMap<>();
        for(int i=1;i<=N;i++)
        {
            in.put(i,0);
            out.put(i,0);
        }
        for(int i=0;i<trust.length;i++)
        {
            for(int j=0;j<2;j++)
            {
                if(j==0)
                {
                  
                       out.put(trust[i][j],out.get(trust[i][j])+1);

                }
                if(j==1)
                {
                  
                     in.put(trust[i][j],in.get(trust[i][j])+1);
                }
            }
        }
        for(Map.Entry<Integer,Integer> entry:out.entrySet())
        {
            if(entry.getValue()==0)
            {
                if(in.get(entry.getKey())==N-1)
                {
                    return entry.getKey();
                }
            }
        }
        return -1;
    }
}