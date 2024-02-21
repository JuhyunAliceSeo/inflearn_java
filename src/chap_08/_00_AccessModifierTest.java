package chap_08;

import chap_07.BlackBox;
import chap_07.BlackBoxRefurbish; //import chap_07.*도 가능 = 챕터7을 모두 쓰겠다는 의미

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName="까망이"; //public
        // b1.resolution = "FHD"; //default라 에러뜸
        // b1.price =200000; //private라 불가
        // b1.color = "블랙"; //protected라 불가-> 자식클래스가 아니기 때문

        BlackBox b2;

    }
}
