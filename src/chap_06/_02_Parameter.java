package chap_06;

public class _02_Parameter {
    //전달값이 있는 메소드
    public static void power(int number){ //number라는 수를 받아 result 결과값에 넣음
        int result = number * number;
        System.out.println(number + " 의 2 승은 " +  result);
    }
    public static void powerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + " 의 " + exponent + " 승은 " +  result);
    }
    public static void main(String[] args) {
        // 위의 power, powerByExp의 메소드를 호출하는 방법
        //전달값, Parameter
        // 2 -> 2 * 2 = 4
        // 3 -> 3 * 3 = 9

        //Argument, 인수 -> 전달값
        power(2);
        power(3);

        powerByExp(2,3);
        powerByExp(3,3);
        powerByExp(10,0);
    }
}
