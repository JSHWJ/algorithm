package basic;

public class 인덱스바꾸기 {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);
        char temp = my_string.charAt(num2);
        sb.setCharAt(num2, sb.charAt(num1));
        sb.setCharAt(num1, temp);
        return sb.toString();
    }
}
