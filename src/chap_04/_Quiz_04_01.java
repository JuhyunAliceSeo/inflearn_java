package chap_04;

public class _Quiz_04_01 {
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

        int hour = 10;
        int cost = 4000 * hour;
        boolean smallCar = false;
        boolean disability = true;

        if(cost >= 30000){
            cost = 30000;
        }
        if(smallCar || disability){
            cost = cost / 2;
        }

        System.out.println("주차 요금은 " + cost + " 원 입니다.");



    }
}
