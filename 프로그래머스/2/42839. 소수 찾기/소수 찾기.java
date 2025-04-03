import java.util.*;

class Solution {
    Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        boolean[] check = new boolean[numbers.length()];
        permute(numbers, "", check);
        
        return getPrimeNum();
    }
    
    public void permute(String numbers, String now, boolean[] check){
        if(!now.equals("")){
            set.add(Integer.parseInt(now));
        }
        
        for(int i = 0; i < numbers.length(); i++){
            if(check[i] != true){
                check[i] = true;
                permute(numbers, now + numbers.charAt(i), check);
                check[i] = false; //백트래킹
            }
        }
    }
    
    public int getPrimeNum(){
        int answer = 0;
        boolean temp;
        
        for(int num : set){
            temp = false;
            
            if(num <= 1){
                continue;
            }
            
            if(num <= 3){
                answer++;
                continue;
            }
            
            if(num % 2 == 0 || num % 3 == 0){
                continue;
            }
            
            for(int i = 5; i * i <= num; i+=6){
                if(num % i == 0 || num % (i+2) == 0){
                    temp = true;
                    break;
                }
            }
            
            if(temp == false){
                answer++;
            }
        }
        
        return answer;
        
    }
    
    
}

// 아이디어 : 순열을 이용해서 모든 경우의 수를 set 리스트에 저장한 후, 
// 이걸 순회하면서 소수를 찾는다. 이후에 소수의 수를 반환한다.