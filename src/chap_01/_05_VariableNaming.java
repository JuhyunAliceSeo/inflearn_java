package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저자할 값에 어울리는 이름
        // 2. 밑줄, 문자, 숫자 사용 가능(공백 사용 불가)
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 힌단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대분자(첫 단어는 제외)
        // 6. 예약어 사용 불가(public, static, void, int, double, ...)

        //입국신고서 (여행)
        String nationality = "대한민국"; //국적
        String firstName= "현성"; //이름
        String lastName= "김"; //성
        String dateOfBirth = "2001-12-31"; //생년월일
        String residentialAddress = "무슨호텔"; //체류지
        String purposeOfVisit = "관광"; // 입국목적
        String flightNo = "KE657"; //한공 편명
        String _flightNo = "KE657"; //밑줄 시작
        String flight_no_2 = "KE657"; //밑줄과 숫자 포함
        //String -flightNo = "KE657";

        int accompany = 2; //동반가족수
        int lengthOfStay = 5; //체류기간

        String item1="시계";
        String item2="가방";
        //String 3item="가방";   -> 맨얖에 숫자 안됨.

        //절대 변하지 않는 상수는 대문자로
        final String CODE = "KE";

    }
}
