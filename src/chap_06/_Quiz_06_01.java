package chap_06;

public class _Quiz_06_01 {
    public static String getHiddenData(String data, int num){
        String result = data.substring(0,num);
        for (int i = 0; i < data.length() - num; i++) {
            result += "*";
        }

        return result;
    }

    public static void main(String[] args) {
        /*
        개인정보를 비공개로 전환하는 메소드 작성
        하나의 메소드에서 모든 동작 처리
        각 정보는 아래 위치로부터 비공개 적용

        이름 : 2번째 글자부터 ( 나** )
        주민등록번호 : 9번째 글자 ( 990130 - 1****** )
        전화번호 : 10번번째 글자 ( 010 - 1234 - 5678 )

        코드 : 주어진 코드의 getHiddenData()메소드를 완성하시오

        */

        String name = "나코딩" ;
        String id = "990130-12345678" ;
        String phone = "010-1234-5678" ;

        System.out.println("이름 : " + getHiddenData(name,1));
        System.out.println("주민등독번호 : " + getHiddenData(id,8));
        System.out.println("전화번호 : " + getHiddenData(phone,9));

    }
}
