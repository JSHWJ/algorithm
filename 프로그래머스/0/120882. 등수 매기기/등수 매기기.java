import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[score.length];
        
        for(int[] s : score){
            list.add(s[0] + s[1]);
        }
        
        list.sort(Comparator.reverseOrder());
        
        for(int i = 0; i < score.length; i++){
            int plus = score[i][0] + score[i][1];
            answer[i] = list.indexOf(plus) + 1;
        }
        
        return answer;
    }

}

/*
      double[] averageList = new double[score.length];
        int[] answerList = new int[score.length];
        
        for(int i = 0; i < score.length; i++){
            averageList[i] = ((double) score[i][0] + score[i][1]) / 2;
        }
        
        TreeMap<Double, Integer> map = new TreeMap<>(Collections.reverseOrder());
        
        for(double average : averageList){
            map.put(average, map.getOrDefault(average, 0) + 1);
        }
        
        for(int j = 0; j < averageList.length; j++){
            int rank = 0;
            for(Map.Entry<Double, Integer> entry : map.entrySet()){
                if(entry.getKey() != averageList[j]){
                    rank += entry.getValue();
                    continue;
                }else{
                    rank++;
                    break;
                }
            }
            answerList[j] = rank;
        }
        
        return answerList;
    }
    
*/