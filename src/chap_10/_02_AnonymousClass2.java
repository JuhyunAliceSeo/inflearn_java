package chap_10;

public class _02_AnonymousClass2 {
    public static void main(String[] args) {
        HomeMadeBurger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();
        System.out.println("-------------------");

        HomeMadeBurger broMadeBurger = getBroMadeBurger();
        broMadeBurger.cook();
        System.out.println("-------------------");
    }

    private static HomeMadeBurger getBroMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생표 군데리아");
                System.out.println("재료 : 빵, 치킨패티, 양배추, 치즈, 딸기쨈, 삶은 계란");
            }
        };
    }

    public static HomeMadeBurger getMomMadeBurger(){
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마표 수제버거");
                System.out.println("재료 : 빵, 소고기패티, 해시브라운, 양상추, 피클, 마요네즈");
            }
        };
    }
}

abstract class HomeMadeBurger{
    public abstract void cook();
}