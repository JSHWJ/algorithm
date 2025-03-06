class Solution {
    int count = 0;

    public int solution(int[] numbers, int target){
        dfs(numbers, 0, 0, target);
        return count;
    }
    
    public void dfs(int[] numbers, int index, int sum, int target){
        if(index == numbers.length){
            if(target == sum){
                count++;
            }
            return;
        }
        
        dfs(numbers, index + 1, sum + numbers[index], target);
        dfs(numbers, index + 1, sum - numbers[index], target);
    }
}

// index를 기준으로 한 단계씩 깊이를 내려가면서 먼저 한 선택지를 다 탐색하고 다음 선택지를 검사한다 즉 dfs