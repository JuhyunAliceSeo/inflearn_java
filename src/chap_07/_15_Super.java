package chap_07;

import chap_07.Camera.FactoryCam;
import chap_07.Camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        //Super -> 부모클래서의 어떤거를 자식클레스에서 쓰는것
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println("------------");
        speedCam.takePicture();

    }
}
