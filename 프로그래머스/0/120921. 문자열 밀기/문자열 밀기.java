import java.util.*;

class Solution {
    public int solution(String A, String B) {
//         char[] A_array = A.toCharArray();
//         char[] B_array = B.toCharArray();
        
//         StringBuilder s = new StringBuilder();
        
//         for(int i = 0; i < B.length(); i++){
//             if(B_array[i] == A_array[0]){
//                 if(i == 0){
//                     if(A.equals(B)){
//                         return 0;
//                     }
//                     continue;
//                 }
                
//                 s.append(B.substring(i, B.length()));
//                 s.append(B.substring(0, i));
                
//                 if(s.toString().equals(A)){
//                     return i;
                    
//                 }else s.setLength(0);
//             }
//         }
        
        
//         return -1;
        
        return (B + B).indexOf(A);
    }
}