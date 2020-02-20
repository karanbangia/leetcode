

class Solution {
    private boolean prime(int x)
    {
          return (x == 2 || x == 3 || x == 5 || x == 7 ||
                x == 11 || x == 13 || x == 17 || x == 19);
    }
    public int countPrimeSetBits(int L, int R) {
        int count=0;
        for(int i=L;i<=R;i++)
        {
            if(prime(Integer.bitCount(i)))
            {
                count++;
            }
        }
        return count;
    }
}