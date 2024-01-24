package chap_07.Camera;

public class FactoryCam extends Camera{ //자식클래스

    public FactoryCam() {
        //this.name = "공장 카메라";
        super("공장 카메라");
    }
    public void recordVideo(){
        super.recordVideo(); //= System.out.println(this.name + " 동영상을 녹화합니다");
        detectFire();
    }

    public void detectFire(){
        //화재 감지
        System.out.println("화재를 감지합니다.");
    }

    @Override //annotation
    public void showMainFeature(){
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
    }

}
