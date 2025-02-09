class Solution {
    public int solution(int[] common) {
        int comparison = common[1] - common[0];
        int comparison_2 = common[2] - common[1];
        
        if(comparison_2 != comparison){
            return common[common.length - 1] * (common[1] / common[0]);
        }else return common[common.length - 1] + comparison;
    
    }
}