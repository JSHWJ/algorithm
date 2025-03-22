import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        List<String> card1_list = new ArrayList<>(Arrays.asList(cards1));
        List<String> card2_list = new ArrayList<>(Arrays.asList(cards2));
        
        for(String word : goal){
            if(!card1_list.isEmpty() && card1_list.get(0).equals(word)){
                card1_list.remove(0);
            } else if(!card2_list.isEmpty() && card2_list.get(0).equals(word)){
               card2_list.remove(0);
            } else return "No";
        }
        return "Yes";
    }
}