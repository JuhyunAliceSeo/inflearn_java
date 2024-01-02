package chap_03;

import java.sql.SQLOutput;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        
        //문자열 반환
        System.out.println(s.replace(" and",",")); //s문자열에서 and를 ,로 변환
        System.out.println(s.substring(7)); //인덱스 기준 7붙처 시작(이전내용은 삭제)
        System.out.println(s.substring(s.indexOf("Java")));
        //"Java"가 시작하는 위치부터 "."가 시작하는 위치 바로 앞까지
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf("."))); //끝위치는 끝위치 직전에까지
        
        // 공백제거
        s="              I love Java.     ";
        System.out.println(s);
        System.out.println(s.trim());//앞뒤 공백 제거

        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2); //JavaPython
        System.out.println(s1 + "," + s2); //Java,Python
        System.out.println(s1.concat(",").concat(s2)); //Java,Python

    }
}
