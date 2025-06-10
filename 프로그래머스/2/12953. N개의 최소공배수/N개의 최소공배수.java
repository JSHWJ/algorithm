class Solution {
    public int gcd(int a, int b){
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    
    public int lcm(int a, int b){
        return a * (b / gcd(a, b));
    }
    
    public int solution(int[] arr) {
        if(arr == null || arr.length == 0){
            return 0;
        }
        
        int answer = arr[0]; // 초기 최소공배수를 배열의 첫번째 원소로 설정한다.
        
        for(int i = 1; i < arr.length; i++){
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }
}
