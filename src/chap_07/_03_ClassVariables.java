package chap_07;

public class _03_ClassVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        System.out.println(b1.modelName);

        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        System.out.println(b2.modelName);

        //특정 범위를 초과하는 충돌 감지시 자동 신고 기능 개발 요부
        // 블랙박스 클래스에 "static boolean canAutoReport = false;"이게 선언되서 새로운 객체를 안만들어도 자동적으로 static이되서 나타날수 있음
        System.out.println(" -  개발 전 - ");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 가능 : " + BlackBox.canAutoReport); //권장

        //기능 개발
        BlackBox.canAutoReport = true;
        System.out.println(" -  개발 후 - ");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 가능 : " + BlackBox.canAutoReport);

    }
}
