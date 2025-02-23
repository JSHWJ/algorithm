class Solution {
    public int solution(int n) {
        int a = Math.min(n, 6);
        int b = Math.max(n, 6);
        int temp = 0;
        
        while(b != 0){
            temp = b;
            b = a % b;
            a = temp;
        }
        
        return (n / a);
       
    }
}