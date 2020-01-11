import java.math.*;
class Solution {
    public String addBinary(String a, String b) {
      BigInteger a_val = new BigInteger(a, 2);
      BigInteger b_val = new BigInteger(b, 2);
      return a_val.add(b_val).toString(2);
    }
}