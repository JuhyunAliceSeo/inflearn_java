package chap_06;

public class _07_VariableScope { //변수의 범위
    public static void methodA() {
        //System.out.println(number); //에러! -> 메인 메소드 안에 있는건 메인메소드에서만 호출할수 있음.
        //System.out.println(result);
    }
    public static void methodB() {
        int result = 1; // 지역변수(메소드 안에서만 쓸수 있음)
    }

    public static void main(String[] args) {
        int number = 3;
        //System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //System.out.println(i);
        {
            int j = 0;
            System.out.println(j);
            System.out.println(number);
        }
        //System.out.println(j);

    }
}
