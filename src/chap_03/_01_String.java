package chap_03;

import java.sql.SQLOutput;

public class _01_String {
    public static void main(String[] args) {
        //String
        String s = "I like Java and Python and C.";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length()); //29

        //대소문자 변환
        System.out.println(s.toUpperCase()); //대문자로
        System.out.println(s.toLowerCase()); //소문자로

        //포함관계
        System.out.println(s.contains("Java")); //포함된다면 true 아니면 false
        System.out.println(s.contains("C#"));
        System.out.println(s.indexOf("Java")); // 위치정보 -> 7
        System.out.println(s.indexOf("C#")); //포함되지않는다면 -> -1
        System.out.println(s.indexOf("and")); //첫 and의 위치정보
        System.out.println(s.lastIndexOf("and")); //마지막 and의 위치정보
        System.out.println(s.startsWith("I like")); //이 문자열로 시작하면 true 아니면 false
        System.out.println(s.endsWith(".")); //이 문자열로 끝나면 TRUE 아니면 false
    }
}
