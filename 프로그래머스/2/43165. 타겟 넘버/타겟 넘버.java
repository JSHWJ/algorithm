// import java.util.*;

// class Solution {
//     public int solution(int[] numbers, int target) {
//         Queue<int[]> queue = new LinkedList<>();
//         queue.offer(new int[]{0, 0}); 
//         int count = 0;
        
        
//         while(!queue.isEmpty()){
//             int[] temp = queue.poll();
//             int sum = temp[0];
//             int index = temp[1];
            
//             if(index == numbers.length){
//                 if (target == sum) {
//                     count++;
//                 }
//                 continue;
//             }
//             queue.offer(new int[]{sum + numbers[index], index + 1});
//             queue.offer(new int[]{sum - numbers[index], index + 1});
//         }
        
//         return count;
//     }
// }

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