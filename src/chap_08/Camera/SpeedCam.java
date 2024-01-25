package chap_08.Camera;

import chap_08.Reporter.Reportable;
import chap_08.detector.Detectable;

public class SpeedCam extends Camera implements Detectable, Reportable{

    public Detectable detector;
    public Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }
    @Override
    public void report() {
        reporter.report();
    }

    @Override
    public void detect() {

        detector.detect();
    }

//    public void detect(){
//        System.out.println("사고를 감지합니다.");
//    }
//    public void report(){
//        System.out.println("사고 신고를 진행합니다.");
//    }
}
