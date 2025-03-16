class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        int length = phone_number.length();
        sb.append("*".repeat(length - 4));
        String back_number = phone_number.substring(length - 4, length);
        sb.append(back_number);
        return sb.toString();
    }
}