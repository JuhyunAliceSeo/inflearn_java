package chap_07;

import chap_07.Camera.Camera;
import chap_07.Camera.FactoryCam;
import chap_07.Camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        //상속

        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        System.out.println("-------------");

        camera.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();

        System.out.println();

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();


    }
}
