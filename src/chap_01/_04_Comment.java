package chap_01;

public class _04_Comment {
    public static void main(String[] args) {
        //주석 : 함꼐 일하는 사람들의 혼란을 줄이기 위해, 나중에 나에게 설명하기위해 사용

        System.out.println("(10분전) 잠시후 결혼식 시작 예정이오는 착성 부탁드립니다.");
        //System.out.println("(5분전) 잠시후 결혼식 시작 예정이오는 착성 부탁드립니다."); //위문장 맨 앞에 커서 넣고 ctrl + d 누르면 위에 내용을 복사해서 붙여줌
        System.out.println("지금부터 결혼식을 시작하겠습니다.");

        int size = 120;
        size = size + 10; //아이들은 빨리크니까 +10
        System.out.println("신발사이즈 " + size + "으로 보여주세요");

        int a = 10;
        int b = 20;
        System.out.println(a + b); //30

        /*
        int a = 10;
        int b = 20;
        System.out.println(a + b); //30
         */

        /* 단축기
        ctrl + /   -> 한줄주석
        ctrl + shift + /    -> 커서에 한만큼 주석
        */

    }
}
