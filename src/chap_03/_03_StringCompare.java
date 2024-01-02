package chap_03;

import java.sql.SQLOutput;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); //문자열 내용이 같으면 true, 다르면 false
        System.out.println(s2.equals("python")); //대문자랑 소문자도 구별함
        System.out.println(s2.equalsIgnoreCase("python")); //대소문자 구별 안하고 내용여부 체크

        //문자열 비교 심화;
        s1 = "1234"; //벽에 붙은 메모지의 비밀번호 정보(참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); //내용을 비교해서 같은지
        System.out.println(s1 == s2); //true , 참조가 같은지

        s1 = new String("1234");
        s2 = new String("1234");

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1 == s2); //false ->이유:new String을 사용해서 참조가 다르므로 false


    }
}
