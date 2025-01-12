package basic;
import java.util.stream.Collectors;

public class 문자열정렬하기_2 {
    public String solution(String my_string) {
        
        String new_string = my_string.chars()
            .mapToObj(i -> Character.toLowerCase((char) i))
            .sorted() // 정렬
            .map(String::valueOf) // 문자를 문자열로 변환
            .collect(Collectors.joining()); // 문자열로 합침 
        
        return new_string;
    }
}
