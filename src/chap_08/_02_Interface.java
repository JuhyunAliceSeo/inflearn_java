package chap_08;

import chap_08.Camera.FactoryCam;
import chap_08.Reporter.NomalReporter;
import chap_08.Reporter.Reportable;
import chap_08.Reporter.VideoReporter;
import chap_08.detector.AdvancedFireDetector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDetector;

public class _02_Interface {
    public static void main(String[] args) {
        //인터페이스 : 뼈대만 제공하는 구조
        //단일 상속( extends )과 달리 여러곳에서 상속가능함

        Reportable nomalReporter = new NomalReporter();
        //NomalReporter nomalReporter = new NomalReporter();
        nomalReporter.report(); //일반 화재 신고를 진행합니다.

        //VideoReporter videoReporter = new VideoReporter();
        Reportable videoReporter = new VideoReporter();
        videoReporter.report(); //직전 30초 영상과 함께 신고를 진행합니다.

        System.out.println("---------------------------------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("---------------------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(fireDetector);
        factoryCam.setReporter(nomalReporter);

        factoryCam.detect();
        factoryCam.report();

    }
}
