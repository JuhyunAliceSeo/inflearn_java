package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        //어린이 키에 따른 놀이기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오.
        /*
        조건
        키가 120cm 이상인 경우에만 탑승가능
        삼항연산자 이용

        실행결과
        키가 115cm 이므로 탑승 불가능 합니다
        키가 121cm 이므로 탑승 가능합니다.
        */
        int height = 115;
        String s = ( height >= 120 ) ? ( "탑승 가능합니다.") : ("탑승 불가능 합니다.");
        System.out.println("키가 " + height + "cm 이므로 " + s);

        height = 121;
        System.out.println("키가 " + height + "cm 이므로 " + s);
        //키가 121cm 이므로 탑승 불가능 합니다.라고뜸 이유는 이미 s의 값이 설정되어 있어 height 변수의 값을 바꾸면 s도 다시 업데이트를 해야 반영이 됨.
        s = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다"; // 추가된 코드
        System.out.println("키가 " + height + "cm 이므로 " + s);




    }
}

