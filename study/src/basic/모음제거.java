package basic;

public class 모음제거 {
    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
     }
}
// StringBuilder와 Set을 사용하여 구현했는데, 정규식을 사용하면 간단하게 해결된다.
// 위의 경우 시간 복잡도 : O(n)