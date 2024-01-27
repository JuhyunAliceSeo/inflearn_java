package chap_10;

import chap_10.converter.Convertible;
import chap_10.converter.KRWconverter;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWconverter converter = new KRWconverter();
        //converter.convert(1);

        convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원"),1);
        //함수형 인터페이스
        Convertible convertible = (USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
        convertUSD(convertible ,1);
    }

    public static void convertUSD(Convertible converter, int USD){
        converter.convert(USD);
    }
}
