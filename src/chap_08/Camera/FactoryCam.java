package chap_08.Camera;

import chap_08.Reporter.Reportable;
import chap_08.detector.Detectable;

public class FactoryCam extends Camera implements Detectable, Reportable {

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
        System.out.println("화재감지");
    }

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
