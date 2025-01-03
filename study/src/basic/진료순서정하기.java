package basic;

import java.util.Arrays;
import java.util.HashMap;

public class 진료순서정하기 {
     public int[] solution(int[] emergency) {
        int[] sorted = emergency.clone();
        Arrays.sort(sorted); // 응급도를 오름차순으로 정렬
        HashMap<Integer, Integer> rankMap = new HashMap<>();

        for (int i = 0; i < sorted.length; i++) {
            rankMap.put(sorted[i], sorted.length - i);
        }
        
        int[] result = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            result[i] = rankMap.get(emergency[i]);
        }
        
        return result;
    }
}
