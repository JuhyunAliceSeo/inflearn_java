package chap_07;

public class _06_ClassMethod {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.callServiceCenter(); //서비스 센터(1588-0000)으로 연결합니다.

        BlackBox b2 = new BlackBox();
        b2.callServiceCenter(); //서비스 센터(1588-0000)으로 연결합니다.

        BlackBox.callServiceCenter(); //서비스 센터(1588-0000)으로 연결합니다.

        String s = String.valueOf(3);
    }
}
