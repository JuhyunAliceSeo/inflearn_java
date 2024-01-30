package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        //예외처리
        // 오류 : 에러 error, 예외 exception
        //     컴파일 오류(코드에 오류가 있어서 실행 자체가 안됨 int i = "문자열"; ) / 런타임 오류(컴파일은 되는데 실행하는데 안될때 int[] arr = new int[3]  arr[5]=100;)

        try{
            //시도하려는 소드 코드
            // System.out.println(3/0);
//            int[] arr = new int[3];
//            arr[5] = 100;

            Object obj = "test";
            System.out.println((int)obj);
        } catch (Exception e){
            //문제가 생길시 캐치문에서 해결
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
            e.printStackTrace(); //java.lang.ArithmeticException: / by zero at chap_11._01_TryCatch.main(_01_TryCatch.java:11)
        }

        System.out.println("프로그램 정상 종료");

    }
}
