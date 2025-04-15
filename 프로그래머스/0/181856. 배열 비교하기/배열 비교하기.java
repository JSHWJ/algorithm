class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int arr1_length = arr1.length;
        int arr2_length = arr2.length;
        
        if(arr1_length == arr2_length){
            int sum1 = 0;
            int sum2 = 0;
            for(int i = 0; i < arr1.length; i++){
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
            if(sum1 > sum2){
                return 1;
            } else if(sum1 == sum2){
                return 0;
            } else return -1;
        } else if(arr1_length > arr2_length){
            return 1;
        } else return -1;
        
    }
}