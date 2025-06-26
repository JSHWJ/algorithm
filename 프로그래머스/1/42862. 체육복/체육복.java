import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lostList = new ArrayList<>();
        List<Integer> reserveList = new ArrayList<>();
        
        for(int l : lost){
            lostList.add(l);
        }
        
        for(int r : reserve){
            reserveList.add(r);
        }
        
        Collections.sort(lostList);
        Collections.sort(reserveList);
        
        for(int r : reserve){
            if(lostList.contains(r)){
                lostList.remove(Integer.valueOf(r));
                reserveList.remove(Integer.valueOf(r));
            }
        }
        
        Iterator<Integer> iterator = lostList.iterator();
    
        while(iterator.hasNext()){
            int num = iterator.next();
            if(reserveList.contains(num - 1)){
                iterator.remove();
                reserveList.remove(Integer.valueOf(num - 1));
            } else if(reserveList.contains(num + 1)){
                iterator.remove();
                reserveList.remove(Integer.valueOf(num + 1));
            }
        }
        System.out.println(lostList);
        return n - lostList.size();
        
    }
}

// 정렬을 하지 않으면, 앞의 순회된 도난 학생이 먼저 가져가게 되면, 뒤의 학생이 못 가져가게 된다.
// 하지만 정렬을 하면 앞에서부터 번호가 작은 학생대로, 차례대로 가져가서 순회 순서로 인해 결과가 달라지는 경우를 방지할 수 있다.
// 그리고 + 1 부터 확인하면, 뒤의 학생부터 빌리게 되어, 앞의 학생이 유일하게 빌릴 수 있는 경우를 놓치게 될 수 있다.
// 그래서 번호가 작은 것부터 확인하면, 작은 번호부터 순서대로 빌려주는 구조가 된다. 