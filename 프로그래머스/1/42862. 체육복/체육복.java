import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lostPeople = new ArrayList<>();
        List<Integer> reservePeople = new ArrayList<>();
        
        for(int l : lost){
            lostPeople.add(l);
        }
        
        for(int r : reserve){
            reservePeople.add(r);
        }
        
        Collections.sort(lostPeople);
        Collections.sort(reservePeople);
        
        Iterator<Integer> iterator = reservePeople.iterator();
        while(iterator.hasNext()){
            int p = iterator.next();
            if(lostPeople.contains(p)){
                iterator.remove(); 
                lostPeople.remove(Integer.valueOf(p));
            }
        }
        
        
        for(int p : reservePeople){
            if(lostPeople.contains(p - 1)){
                lostPeople.remove(Integer.valueOf(p - 1));
            } else if(lostPeople.contains(p + 1)){
                lostPeople.remove(Integer.valueOf(p + 1));
            }
        }
        
        return n - lostPeople.size();
    }
}