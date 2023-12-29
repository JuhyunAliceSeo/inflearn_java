package chap_02;

public class _03_Operator3 {
    public static void main(String[] args) {
        // 비교 연산자
        System.out.println(5 > 3); //5는 3보다 크다 (true)
        System.out.println(5 >= 3); //5는 3보다 크거나 같다 (true)
        System.out.println(5 >= 5); //5는 5보다 크거나 같다 (true)
        System.out.println(5 >= 7); //5는 7보다 크거나 같다 (false)

        System.out.println(5 < 3); //5는 3보다 작다 (false)
        System.out.println(5 <= 3); //5는 3보다 작거나 같다 (false)

        System.out.println(5 == 5); //같은것은 == 2개를 붙여줘야함. (true)
        System.out.println(5 == 3); //5와 3은 같다(false)
        System.out.println(5 != 5); //5와 5는 같지 않다(false)
        System.out.println(5 != 3); //5와 3는 같지 않다(true)

    }
}
