package chap_07;

public class BlackBox {
    //4개의 인스턴스 변수 또는 필드를 가지게 됨
    String modelName; //모델명
    String resolution; //해상도
    int price; //가격
    String color; //색상
    int serialNumber;

    static int counter = 0;//시리얼 번호를 생성해주는 영상(처음엔 0이었다가 ++연산을 통해 시리얼 번호 생성)

    //static을 붙이는 순간 클래스 변수가 되고 이 클래스로부터 만들어 지는 모든 개체에 똑같이 적용이 됨
    static boolean canAutoReport = false; //자동 신고 기능

    BlackBox(){  //기본 생성자 : 객체가 생성될때 자동으로 호출되는 메소드
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급 받았습니다 : " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color){
//        this(); //기본 생성자를 실행하고 아래쪽 다른 동작을 하게됨.
//
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    void autoReport(){  //메소드(기능) 정의
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

    void record(){ //객체마다 서로 다른 동작을 할때 필요
        record(true,true,5); //recode()로 호출될때 record(true,true,5);로 호출된다
        //이게 문장이나 기타등등 수정시 재사용성 용이하고 편리함
    }

    static void callServiceCenter(){ //공통적으로 사용하는 기능을 사용할떄 사용 가능
        System.out.println("서비스 센터(1588-0000)으로 연결합니다.");
        // modelName = "test"; --> 스테틱으로 선언한 클래스는 메소드 내에서는 직접 접근 불가능 -->공통적으로 사용하는 기능을 사용할떄 사용 가능
        canAutoReport = false; //-->메소드와 메소드 내에서 직접 접근 가능
    }

    void appendModelName(String modelName) {
        this.modelName += modelName;
        //this.modelName은 변수 void appendModelName(String modelName)의 modelName이 아니라 인스턴스 String modelName; 을 선언해준것과 같다
    }


    //Getter & Setter
    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution(){
        if(resolution == null || resolution.isEmpty()){
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    void setResolution(String resolution){
        this.resolution = resolution;
    }

    int getPrice(){
        return price;
    }

    void setPrice(int price) {
        if(price < 100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    String getColor(){
        return color;
    }

    void setColor(String color){
        this.color = color;
    }
}
