package chap_06;

public class _05_Overloading { //->그냥 메소드 이름을 같게하면 자연스럽게 오버로딩이 됨.
    public static int getPower(int number){
        int result = number * number;
        return result;
        //return number * number
    }
    public static int getPower(String strNumber){ //이름이 똑같음
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent) { // 전달값의 타입이나 개수가 다를수 있음.
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        //메소드 오버로딩
        //같은 이름의 메소드를 여러번 선언
        // 1. 전달값의 타입이 다르거나 ( 반환값이 다르면 안됨 )
        // 2. 전달값의 갯수가 다르거나
        System.out.println(getPower(3));
        System.out.println(getPower("3"));
        System.out.println(getPower(3,3));
    }
}
