package chap_10;

import java.util.ArrayList;
import java.util.Arrays;

public class _Quiz_10 {
    public static void main(String[] args) {
        /*
        스트림을 이용하여 미술관 방문 손님에게 적절한 입장료를 안내하는 프로그램을 작성하시오

        조건
        손님 이름 및 나이 정보를 위한 Customer 클래스 생성
        입장료는 1인당 5000원으로 고정
        20세 이상의 손님들에게만 입장료 부과(그외에는 무료)

        힌트
        map()을 이용하여 원하는 형태로 데이터 가공을 할수 있음
        삼항연산자 (int max = a> b? a: b)이용
        */

        ArrayList<Customer> list= new ArrayList<>();
        list.add(new Customer("챈들러",50));
        list.add(new Customer("레이첼",42));
        list.add(new Customer("모니카",21));
        list.add(new Customer("벤자민",18));
        list.add(new Customer("제임스",5));

        System.out.println("미술관 입장료");
        System.out.println("------------");
        list.stream()
                .map(x -> x.age >=20 ? x.customer + " 5000원" : x.customer + " 무료") //모든 사람에 대해 뽑아야하니까 map
                .forEach(System.out::println);
    }
}
class Customer{
    String customer;
    int age;

    public Customer(String customer, int age) {
        this.customer = customer;
        this.age = age;
    }
}
