package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        //제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready(); //커피 주문 완료 : 33
        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println("-----------------------------");

        CoffeeByName c3 = new CoffeeByName(34); //object로 인해 다른것도 다 넣을수 있음.
        c3.ready();
        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println("-----------------------------");

        int c3Name = (int)c3.name; //오브젝트였기때문에 형변환 필요
        System.out.println("주문 고객 번호 : " + c3Name);
        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);
        // c4Name = (String) c3Name;가 불가능

        System.out.println("-----------------------------");

        Coffee<Integer> c5 = new Coffee<>(35); //제네릭클래스로 이용함 / 인티져로 받는다
        c5.ready();
        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : " + c5Name);

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);

        System.out.println("-----------------------------");
        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동")); //유저클래스에 있는 유저를 커피주문함
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("서장훈"));
        c8.ready();

        System.out.println("-----------------------------");
        orderCoffee("김영철");
        orderCoffee(36);
        orderCoffee(37, "라떼");
    }
    public static <T> void orderCoffee(T name){
        System.out.println("커피 준비 완료 : " + name);

    }

    public static <T, V> void orderCoffee(T name, V coffee){
        System.out.println("커피 준비 완료 : " + name + "님, 주문하신 " + coffee + " 준비되었습니다");

    }
}
