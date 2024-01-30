package chap_11;

public class _Quiz_11 {
    public static void main(String[] args) {
        /*
        인기가 많은 상품이 선착순으로 판매되는 온라인 쇼핑몰에서 발생할 수 있는 문제를 처리하는 프로그램을 작성하시오.

        조건
        발생 가능 문제의 2가지 조건 : 상품구매 가능 시간, 상품 매진
        각 문제에 대한 사용자 정의 예외 클래스 작성
        에로 코드에 따른 의도적 예외 발생 및 예외 처리
        */

        int errorCode = 2;
        try{
            switch (errorCode){
                case 0:
                    System.out.println("상품 구매를 완료하였습니다");
                    break;
                case 1:
                    throw new NotOnSaleException("상품 구매 가능 시간이 아닙니다.");
                    //break가 필요 없는 이유? 에러가 생겨서 throw문을 발생 시켰기 때문에 추가적인 break문은 필요하지 않음.
                case 2:
                    throw new SoldOutException("해당 상품은 매진되었습니다");
            }

        } catch (NotOnSaleException e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시 이후부터 가능합니다");
        } catch (SoldOutException e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요.");
        }
    }
}

class NotOnSaleException extends Exception{
    public NotOnSaleException(String message) {
        super(message);
    }
}

class SoldOutException extends Exception{
    public SoldOutException(String message) {
        super(message);
    }
}
