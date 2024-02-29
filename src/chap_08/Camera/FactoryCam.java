package chap_08.Camera;

import chap_08.Reporter.Reportable;
import chap_08.detector.Detectable;

public class FactoryCam extends Camera implements Detectable, Reportable { //인터페이스는 implements

    private Detectable detector;
    private Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    } //인터페이스를 써서 하려면 위의 변수(public Detectable detector;)를 만들어 줘야함

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("화재감지");
    } // 카메라에 있는 메소드를 자식클래스에서 구현

    @Override
    public void report() {
        reporter.report();
    }

    @Override
    public void detect() {

        detector.detect();
    }

//    public void detect() {
//        System.out.println("화재를 감지합니다.");
//    }
//
//    public void report() {
//        System.out.println("화재 신고를 진행합니다");
//    }
}
