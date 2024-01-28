package chap_10;

import chap_10.converter.Convertible;
import chap_10.converter.ConvertibleWithNoParams;
import chap_10.converter.ConvertibleWithRetrun;
import chap_10.converter.KRWconverter;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWconverter converter = new KRWconverter();
        //converter.convert(1);

        convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원"),1);
        //함수형 인터페이스
        Convertible convertible = (USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
        convertUSD(convertible ,2);

        //전달값이 하나도 없다면?
        ConvertibleWithNoParams c1 = () -> System.out.println("1달러는 1400원");
        c1.converts();

        //두 줄 이상의 코드가 있다면?
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + "달러 = " + (USD * KRW) + " 원");
        };
        c1.converts();

        //전달값이 2개인 경우
        ConvertibleWithTwoParams c2 = (USD, KRW) -> System.out.println(USD + "달러 = " + (USD * KRW) + " 원");
        c2.convert(3,1400);

        //반환값이 있는 경우?
        ConvertibleWithRetrun c3 = (d, w) -> { return d * w ; };
        int result = c3.convert(20, 1400);
        System.out.println("20 달러 = " + result + " 원");

    }

    public static void convertUSD(Convertible converter, int USD){
        converter.convert(USD);
    }
}
