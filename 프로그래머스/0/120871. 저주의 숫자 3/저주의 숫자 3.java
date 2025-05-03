class Solution {
    public int solution(int n) {
        int num = 0;
        for(int i = 1; i <= n; i++){
            while(true){
                num++;
                if(num % 3 != 0 && String.valueOf(num).indexOf("3") == -1){
                    break;
                }
            }
        }
        return num;
    }
}