package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        /*
        조건문을 활용하여 주차요금 정산 프로그램을 작성하시오

        주차요금은 시간당 4000원 (일일 최대요금은 30000원)
        경차 또는 장애인 차량은 최종 요금에서 50% 할인

        예시
        일반 차량 5시간 주차시 -> 주차 요금은 20000 원 입니다.
        경차 5시간 주차시 -> 주차 요금음 10000원 입니다.
        장애인 차량 10시간 주차시 -> 주차요금은 15000원 입니다.
        */

        //일반 차량 5시간 주차시
        int hour = 10;
        int price = 4000 * hour;

        boolean disable = false;
        boolean smallCar = true;

        //30000원 초가시 일일 최대 요금으로 수정
        if (price > 30000) {
            price = 30000;
        }

        //경짜 또는 장애인 차량인 겅유 50%할인
        if (disable || smallCar) {
            price = price / 2;
        }

        //실행 결과 출력
        System.out.println("주차 요금은 " + price + " 원 입니다.");
    }
}
