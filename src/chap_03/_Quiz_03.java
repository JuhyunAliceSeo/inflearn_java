package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        //주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성하시요
        //주민등록번호는 13자리의 숫자로 구성
        //앞 6자리는 생년월일 정보, 뒷자리 7자리 중 첫번째 숫자는 성별정보
        //입력 데이터는 -를 포함한 14자리의 문자열 형태

        /*
         예시
         "901231-1234567"인 경우 901234-1 까지 출력
        */
        String id = "901231-1234567";
        System.out.println(id.substring(0,8));
        System.out.println(id.substring(0, id.indexOf("-")+2));
    }
}
