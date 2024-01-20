package chap_07;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.record(false, false, 10);
        //녹화를 시작합니다
        //영상은 10분 단위로 표시됩니다
        System.out.println("-----------------");

        b1.record(true, false,3);
        System.out.println("--------------------");

        b1.record(true,true,5);
        System.out.println("---------------------");

        b1.record();
        //녹화를 시작합니다
        //영상에 날짜 정보가 표시됩니다.
        //영상에 속도정보가 표시됩니다.
        //영상은 5분 단위로 표시됩니다

        //String
        String s = "BlackBox";
        System.out.println(s.indexOf("a")); //ctrl + indexOf click을 누르면 인덱스오브에 대한 설명이 나옴

    }
}
