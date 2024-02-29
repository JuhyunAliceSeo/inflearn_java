package chap_09.coffee;

public class CoffeeByName {
    public Object name; //모든 Integer, Double등 다른 형태도 넣을수 있음. -> 항상 형변환이 필요함

    public CoffeeByName(Object name){
        this.name = name;
    }

    public void ready(){
        System.out.println("커피 주문 완료 : " + name);
    }
}
