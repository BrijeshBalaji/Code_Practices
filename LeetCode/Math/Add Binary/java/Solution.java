import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
         BigInteger s = new BigInteger(a,2);
         BigInteger t = new BigInteger(b,2);

         BigInteger sum = s.add(t);

         return sum.toString(2);
    }
}