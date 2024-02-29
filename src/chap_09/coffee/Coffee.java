package chap_09.coffee;

public class Coffee <T> { //제네릭클래스
    public T name;

    public Coffee(T name){
        this.name = name;
    }

    public void ready(){
        System.out.println("커피 주문 완료 : " + name);
    }
}
