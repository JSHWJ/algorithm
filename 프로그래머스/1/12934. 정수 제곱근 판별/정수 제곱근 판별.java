class Solution {
    public long solution(long n) {
        long m = (long)Math.sqrt(n);
        if(m * m != n){
            return -1;
        } else{
            return (long) ((m + 1) * (m + 1));
        }
    }
}