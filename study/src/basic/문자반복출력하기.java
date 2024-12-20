package basic;

public class 문자반복출력하기 {
    public String solution(String my_string, int n) {
        StringBuilder new_string = new StringBuilder();
        for(int i = 0; i < my_string.length() ; i++){
            new_string.append(String.valueOf(my_string.charAt(i)).repeat(n));
        }
        return new_string.toString();
    }
}

/* 
String은 불변이기 때문에, 매번 새로운 객체를 생성하게 된다.
따라서 루프 내에서 문자열을 다룰 때 StringBuilder를 쓰는 것이 성능상 이점이 있다.
StringBuilder는 가변 버퍼를 사용하여 문자열 추가 작업이 효율적이다.
*/

/* 자바 11부터는 repeat() 사용 가능 
이전 버전에서는 중첩반복문 사용하면 된다. */

/* StringBuilder는 char를 바로 추가할 수 있다. (내부적으로 변환함) 
하지만 repeat를 호출하려면 문자열이어야하기 때문에 charAt를 문자열로 변환해줘야한다. */ 