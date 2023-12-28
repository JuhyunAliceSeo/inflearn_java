package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        /*
        버스 도착 정보를 출력하는 프로그램을 작성하시오.
        각 정보는 적절한 자료현의 변후에 정의합니다.

        버스번호는 "1234", "상암08"과 같은 형태
        남은시간은 분단위(예: 3분, 5분)
        남은 거리는 km단위(예: 1.5km , 0.8km)

        결과
        상암 08번 버스
        약 3분 후 도착
        남은 거리 1.2km
        */

        String busName = "상암 08 ";
        int min = 3;
        double distance = 1.2;

        System.out.println(busName +"번 버스");
        System.out.println("약 " + min + "분 후 도착");
        System.out.println("남은 거리 " + distance +"km");
    }
}
