class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1)return stones[0];
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++)
        {
            pq.add(stones[i]);
        }
       while(pq.size()!=1)
       {
           if(pq.isEmpty())
           {
               return 0;
           }
       
            int x=pq.poll();
            int y=pq.poll();
            if(Math.abs(x-y)==0)
            {
                continue;
            }
            else
            {
                pq.add(Math.abs(x-y));
            }
       }
        return pq.poll();
    }
}