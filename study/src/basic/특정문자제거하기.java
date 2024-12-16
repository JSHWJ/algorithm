package basic;

class 특정문자제거하기 {
    public String solution(String my_string, String letter) {
        return my_string.replace(letter, ""); 
    }
}
 // StringBuilder를 썼는데 replace() 쓰면 되는 일이었다.