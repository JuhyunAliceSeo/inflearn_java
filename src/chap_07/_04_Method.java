package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        //클래스 안에 기능을 추가하여 그 기능을 정의할수 있음
        b1.autoReport(); //지원 안됨
        BlackBox.canAutoReport = true;
        b1.autoReport(); //지원 됨

        b1.insertMemoryCard(128); //이렇게 정의하면 블랙박스 클래스의 인서트메모리카드 기능에 전달값을 받아 문장을 출력해줌
        //메모리 카드가 삽입되었습니다
        //용량은 128 GB 입니다.

        //일반 영상 : 1
        //이벤트 영상(어느정도 충돌 감지된 영상) : 2
        int fileCount = b1.getVideoFileCount(1); //일반영상
        System.out.println("일반 영상 파일 수 : " + fileCount + "개");

        fileCount = b1.getVideoFileCount(2); //이벤트 영상
        System.out.println("이벤트 영상 파일 수 : " + fileCount + "개");
    }
}
