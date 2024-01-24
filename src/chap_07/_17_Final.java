package chap_07;

import chap_07.Camera.ActionCam;
import chap_07.Camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final
        ActionCam actionCam = new ActionCam();
        // actionCam.lens="표준렌즈"; final을 액션캠에 써서 바꿀수 없음
        actionCam.recordVideo();
        actionCam.makeVideo(); //액션 카메라 : 표준렌즈로 촬영한 영상을 통해 멋진 비디오를 제작합니다 --> 액션 카메라 : 광각렌즈로 촬영한 영상을 통해 멋진 비디오를 제작합니다

        System.out.println("-----------------");
        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.makeVideo();
    }
}
