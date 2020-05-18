class Solution {
   public boolean checkStraightLine(int[][] coordinates) {
        double slope=(double)(coordinates[1][1]-coordinates[0][1])/(double)(coordinates[1][0]-coordinates[0][0]);

      if(slope==Double.POSITIVE_INFINITY || slope==Double.NEGATIVE_INFINITY)
      {
          slope=Double.POSITIVE_INFINITY;
      }
        for(int i=2;i<coordinates.length;i++)
        {
            double x=(double)(coordinates[i][1]-coordinates[i-1][1])/(double)(coordinates[i][0]-coordinates[i-1][0]);       
            if(x==Double.POSITIVE_INFINITY || x==Double.NEGATIVE_INFINITY)
          {
              x=Double.POSITIVE_INFINITY;
          }    
            if(x!=slope)
            {
                return false;
            }
        }
        return true;

    }
}