package chap_08;

import chap_08.Camera.Camera;
import chap_08.Camera.FactoryCam;
import chap_08.Camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        //데이터 추상화 : 몰라도 되는 정보는 숨기고 나와야 하는것만 쓰인다
        //abstract
        //추상 클래스(아직 완성되지 않은 클래스 -> 객체를 만들수 없음 / 반드시 상속해야함)
        //추상 메소드(추상 클래스 및 인터페이스에서 사용 가능한 껍데기만 있는 메소드 -> 있으면 반드시 자식클래스에서 구현해야함)

        //Camera camera = new Camera(); 추상클래스이기 때문에 객체를 만들수 없음
        FactoryCam factoryCam = new FactoryCam(); //자식클래스는 객체를 만들수 있음.
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
