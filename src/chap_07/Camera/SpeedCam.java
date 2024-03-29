package chap_07.Camera;

//SpeedCam is a Camera.(IS-A 관계)
public class SpeedCam extends Camera{ ////자식클래스
    public SpeedCam() {
        // this.name = "과속단속 카메라";
        super("과속단속 카메라");
    }
    public void takePicture(){
        super.takePicture();//System.out.println(this.name + " 사진을 촬영합니다");
        checkSpeed();
        recognizeLicensePlate();
    }

    public void checkSpeed(){
        // 속도 체크
        System.out.println("속도를 측정합니다");
    }

    public void recognizeLicensePlate(){
        //번호 인식
        System.out.println("차량 번호를 인식합니다");
    }

    @Override //annotation
    public void showMainFeature(){
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
    }
}
