package hash;
import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {
        public int solution(int[] nums) {
        Set<Integer> temp = new HashSet<>();
        for(int num : nums){
            temp.add(num);
        }
        if(temp.size() < nums.length / 2){
            return temp.size();
        } else return (nums.length / 2);
     
    }
}
