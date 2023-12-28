package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        //변수 = int, float, double, long, string, boolean

        String name; //네임이라는 문자열 선언
        name = "나도코딩"; // 프로그래밍에서 =는 왼쪽이 변수에 오른쪽의 내용을 넣겠다는 선언

        int hour;
        hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour +"시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A'; //한문자이면 "가 아닌 '으로 써도됨.
        name = "강백호"; //변수는 업데이트 가능하다.

        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.1423425234;
        float f = 3.14234234234F; //float은 실수값뒤에다가 f를 넣어줘야함
        System.out.println(d);
        System.out.println(f); //소수점 아래 6자리만 가능

        //int i = 10000000000; int는 -21억부터 +21억까지 넣을수 있음.
        long l = 10000000000L; //long은 실수값뒤에다가 L를 넣어줘야함
        l = 100_000_000_000L;
        System.out.println(l); //100000000000
    }
}
