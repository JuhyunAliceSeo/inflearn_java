package chap_07;

import java.sql.SQLOutput;

public class _08_Constructor {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        //블랙박스 클래스에   BlackBox(){System.out.println("기본 생성자 호출");} 를 적어서 기본생성자 호출이 출력됨
        b1.modelName = "까망이";
        b1.resolution= "FHD";
        b1.price= 200000;
        b1.color= "블랙";
        System.out.println(b1.modelName);
        System.out.println(b1.serialNumber);

        System.out.println("--------------------------");

        BlackBox b2 = new BlackBox("하양이", "UHD", 30000,  "화이트");
        System.out.println(b2.modelName);
        System.out.println(b2.serialNumber);
        //블랙박스 클래스에
        // BlackBox(String modelName, String resolution, int price, String color){
        //        this.modelName = modelName;
        //        this.resolution = resolution;
        //        this.price = price;
        //        this.color = color; } 을 선언해서 나올수 있음
    }
}
