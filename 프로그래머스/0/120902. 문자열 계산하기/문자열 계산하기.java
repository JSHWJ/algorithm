class Solution {
    public int solution(String my_string) {
        String[] new_array = my_string.split(" ");
        int answer = Integer.valueOf(new_array[0]);
        
        for(int i = 1; i < new_array.length; i = i + 2){
            if(new_array[i].equals("+")){
                answer += Integer.valueOf(new_array[i + 1]);
            }else if(new_array[i].equals("-") ){
                answer -= Integer.valueOf(new_array[i + 1]);
            }
        }
        
        return answer;
    }
}