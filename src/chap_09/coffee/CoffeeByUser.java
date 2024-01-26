package chap_09.coffee;

import chap_09.user.User;

public class CoffeeByUser<T extends User>{ //유저클래스 또는 상속된 vip유저클래스만 상속 받을수 있음.
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }
    public void ready(){
        System.out.println("커피 주문 완료 : " + user.name);
        user.addPoint();
    }

}
