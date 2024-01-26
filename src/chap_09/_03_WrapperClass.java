package chap_09;

import java.sql.SQLOutput;

public class _03_WrapperClass {
    public static void main(String[] args) {
        //래퍼(Wrapper) 클래스
        // int double float char

        Integer i = 123;
        Double d = 1.0;
        Character c = 'A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("--------------------");

        System.out.println(i.intValue()); //인티져 래퍼클래스틑 인트로 바꿔줌
        System.out.println(d.intValue()); //1
        System.out.println(c.charValue());

        System.out.println("--------------------");
        String s = i.toString();
        System.out.println(s); //문자형태 s
    }
}
