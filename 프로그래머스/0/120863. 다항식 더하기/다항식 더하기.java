class Solution {
    public String solution(String polynomial) {
        String[] array = polynomial.split(" ");
        int xnum = 0;
        int num = 0;
        StringBuilder answer = new StringBuilder();
        
        for(String a : array){
            if(a.contains("x")){
                xnum += a.replace("x", "").isEmpty() ? 1 : Integer.parseInt(a.replace("x", ""));
            } else if(a.equals("+")){
                continue;
            } else {
                num += Integer.parseInt(a);
            }
        }
        
        if(xnum != 0 && xnum != 1){
            answer.append(xnum + "x");
        } else if(xnum == 1){
            answer.append("x");
        }
        
        if(num == 0){
            if(xnum == 0){
                return "0";
            } else return answer.toString();
       } else {
            if(xnum == 0){
                return String.valueOf(num);
            } else{
                answer.append(" + " + num);
                return answer.toString();   
            }
        }

    }
}