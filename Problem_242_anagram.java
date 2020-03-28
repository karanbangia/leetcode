class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        char temp1[]=s.toCharArray();
        char temp2[]=t.toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        s=new String(temp1);
        t=new String(temp2);
        return s.equals(t);
    }
}