class Solution {
    int answer = 0;
    
    public int solution(int[] numbers, int target){
        dfs(numbers, target, 0, 0);
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int depth, int sum){
        if(depth == numbers.length){
            if(target == sum){
              answer++;  
            }
            return;
        }
        dfs(numbers, target, depth + 1, sum - numbers[depth]);
        dfs(numbers, target, depth + 1, sum + numbers[depth]);
    }

}

// 이건 방법을 하나하나 다 해야하니까 dfs 같음