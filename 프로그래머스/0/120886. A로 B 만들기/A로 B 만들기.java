class Solution {
    public int solution(String before, String after) {
        int[] charCount = new int[26];

        for (char c : before.toCharArray()) {
            charCount[c - 'a']++;
        }
        
        for (char c : after.toCharArray()) {
            charCount[c - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return 0; 
            }
        }

        return 1; 
    }
}