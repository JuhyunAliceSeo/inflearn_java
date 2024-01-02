package chap_04;

public class _01_If {
    public static void main(String[] args) {
        //제어문 - 조건문
        /* if (조건)
           ...수행할 명령...
        */
        //if문 내에서 하나의 문장을 실행할 경우 {} 생략가능
        int hour = 15; //오전 10시
        if(hour<14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        }
        System.out.println("커피주문 완료");

        //오후 2시 이전, 모닝커피를 마시지 않는 경우
        hour = 10;
        boolean morningCoffee = false; //모닝커피 마시지 않음

        //조건이 2개이상일 경우 &&
        if(hour < 14 && morningCoffee ==false){ //!morningCoffee일경우 반대결과로 나옴
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피주문 완료");

        // 오후 2시 이후이거나 모닝 커피를 마신 경우?
        hour = 15;
        morningCoffee = true;
        if(hour >= 14 || morningCoffee){ //or
            System.out.println("아이스 아메리카노(디카페인) +1");
        }
        System.out.println("커피주문 완료");

    }
}
