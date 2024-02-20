package chap_06;

public class _04_ParameterAndReturn {
    public static int getPower(int number){
        int result = number * number;
        return result;
        //return number * number
    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        //전달값과 반환값이 있는 메소드
        int retVal = getPower(2); //-> 반환값을 저장하기위한 변수가 필요하기때문에 "int retPower"를 선언한거임
        System.out.println(retVal);

        retVal = getPower(3);
        System.out.println(retVal);

        retVal = getPowerByExp(3,3);
        System.out.println(retVal);

        System.out.println(getPowerByExp(4,3));
    }
}
