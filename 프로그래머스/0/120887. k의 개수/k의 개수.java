class Solution {
    public int solution(int i, int j, int k) {
       int count = 0;
        String target = String.valueOf(k); // k를 문자열로 변환

        for (int num = i; num <= j; num++) {
            String str = String.valueOf(num); // 현재 숫자를 문자열로 변환
            for (char ch : str.toCharArray()) {
                if (String.valueOf(ch).equals(target)) {
                    count++;
                }
            }
        }
        return count;
    }
    
}