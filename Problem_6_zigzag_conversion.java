/*
example karanbangia

layer 1 layer2 layer3
k        a        r
n        a        a
g        b         a
         n
         i
output string ="kngaabniraa"
*/
class Solution {
    public String convert(String s, int numRows) {
        if(numRows>=s.length() || numRows<=1)
        {
            return s;
        }
       List<StringBuilder> layer=new ArrayList<>(numRows);
        for(int i=0;i<numRows;i++)
        {
            layer.add(new StringBuilder());
        }
        int row=0;
        int step=1;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            layer.get(row).append(s.charAt(i));
            if(row==numRows-1)
            {
                step=-1;
            }
            if(row==0)
            {
                step=1;
            }
            row+=step;
        }
        for(StringBuilder x:layer)
        {
            sb.append(x);
        }
        return sb.toString();
    }
}