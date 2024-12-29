package basic;

import java.util.Scanner;

public class 대소문자바꿔서출력하기 {
     public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(char ch : a.toCharArray())
            if(Character.isUpperCase(ch)){
                result.append(Character.toLowerCase(ch));
            }else {
                result.append(Character.toUpperCase(ch));
        }
        
        System.out.println(result);
    }
}
