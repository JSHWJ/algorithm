class Solution {
    public long solution(int price, int money, int count) {
        long total = 0;
        
        if(count % 2 == 1){
            total = (long) price * ((count+1)/2) * count;
        } else{
            total = (long) price * (count/2) * (count+1);
        }
        
        if((long) money - total >= 0){
            return 0;
        } else return Math.abs((long) money - total);
    }
}