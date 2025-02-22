import java.math.*;

class Solution {
    public int solution(int balls, int share) {
        BigInteger n = BigInteger.ONE;
        BigInteger m = BigInteger.ONE;
        
        if(share > balls - share){
            share = balls - share;
        }
        
        for(int i = balls; i > (balls - share); i--){
            n = n.multiply(BigInteger.valueOf(i));
        }
        
        for(int i = 1; i <= share; i++){
            m = m.multiply(BigInteger.valueOf(i));
        }
        
        return n.divide(m).intValue();
    }
}