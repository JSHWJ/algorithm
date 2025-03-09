class Solution {
    public int solution(String myString, String pat) {
        String temp1 = myString.replace("A","C");
        String temp2 = temp1.replace("B","D");
        
        String result1 = temp2.replace("C","B");
        String result2 = result1.replace("D","A");
        
        if(result2.contains(pat)){
            return 1;
        } else return 0;
    
    }
}