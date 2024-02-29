package chap_09.coffee;

public class CoffeeByNumber {
    public int waitingNumber;

    public CoffeeByNumber(int waitingNumber) {
        this.waitingNumber = waitingNumber;
    } //웨이팅넘버를 받는 생성자 생성
    public void ready(){
        System.out.println("커피 주문 완료 : " + waitingNumber);
    }
}
