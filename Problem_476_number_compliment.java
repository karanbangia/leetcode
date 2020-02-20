class Solution {
    public int findComplement(int num) {
      String bString=Integer.toBinaryString(num);
      StringBuilder sb=new StringBuilder();
        for(int i=0;i<bString.length();i++)
        {
            sb.append(1^Character.getNumericValue(bString.charAt(i)));
        }
        return Integer.parseInt(sb.toString(),2);
    }
}