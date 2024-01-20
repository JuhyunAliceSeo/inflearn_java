package chap_07;

public class BlackBox {
    //4개의 인스턴스 변수 또는 필드를 가지게 됨
    String modelName; //모델명
    String resolution; //해상도
    int price; //가격
    String color; //색상

    //static을 붙이는 순간 클래스 변수가 되고 이 클래스로부터 만들어 지는 모든 개체에 똑같이 적용이 됨
    static boolean canAutoReport = false; //자동 신고 기능

    //메소드(기능) 정의
    void autoReport(){
        if(canAutoReport){
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }
        else {
            System.out.println("자동 신고 기능이 지원 되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity){
        System.out.println("메모리 카드가 삽입되었습니다");
        System.out.println("용량은 " + capacity + " GB 입니다.");
    }

    int getVideoFileCount(int type){
        if(type == 1){ //일반 영상
            return 9;
        } else if (type==2) { //이벤트 영상
            return 1;
        }
        return 10;
    }

    // showDataTime : 날짜정보 표시여부
    // showSpeed : 속도정보 표시 여부
    // min : 영상 기록 단위(분)
    void record(boolean showDataTime, boolean showSpeed, int min){
        System.out.println("녹화를 시작합니다");
        if(showDataTime) {
            System.out.println("영상에 날짜 정보가 표시됩니다.");
        }
        if(showSpeed){
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min +"분 단위로 표시됩니다");
    }

    void record(){
        record(true,true,5); //recode()로 호출될때 record(true,true,5);로 호출된다
        //이게 문장이나 기타등등 수정시 재사용성 용이하고 편리함
    }
}
