package basic;

public class 다항식더하기 {
    public String solution(String polynomial) {
        String[] parts = polynomial.split(" \\+ ");
        int xTerm = 0; // x의 계수를 저장할 변수
        int constantTerm = 0; // 상수항을 저장할 변수

        for (String part : parts) {
            if (part.contains("x")) { 
                if (part.equals("x")) {
                    xTerm += 1; // 계수가 1인 경우
                } else {
                    xTerm += Integer.parseInt(part.replace("x", "")); // 계수를 더함
                }
            } else { // 상수항일 경우
                constantTerm += Integer.parseInt(part);
            }
        }

        StringBuilder result = new StringBuilder();
        if (xTerm != 0) {
            result.append(xTerm == 1 ? "x" : xTerm + "x");
        }
        if (constantTerm != 0) {
            if (result.length() > 0) result.append(" + ");
            result.append(constantTerm);
        }
        
        // 만약 모든 계수가 0일 경우 "0" 반환
        return result.length() > 0 ? result.toString() : "0";
    }
}
