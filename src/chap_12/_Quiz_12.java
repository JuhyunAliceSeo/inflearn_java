package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {
        /*
        상품 A와 B로 이루어진 세트 상품을 효율적으로 포장하는 프로그램을 작성하시오

        조건
        상품 A와 B는 각각 5개씩 준비
        상품 A와 B는 두사람이 독립적으로 준비
        상품 A와 B가 모두 준비된 이후 세트 상품 포장 시작
        포장이 필요한 세트 상품은 총 5개
        */
        Present present = new Present();

        Runnable rapping1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i ++) {
                    System.out.println("A 상품 준비 " + i + "/5");
                }
                System.out.println("--- A 상품 준비 완료 ---");
            }
        };

        Runnable rapping2 = new Runnable() {
            public void run() {
                for (int i = 1; i <= 5; i ++) {
                    System.out.println("B 상품 준비 " + i + "/5");
                }
                System.out.println("--- B 상품 준비 완료 ---");
            }
        };

        Thread rappingThread1 = new Thread(rapping1);
        Thread rappingThread2 = new Thread(rapping2);

        rappingThread1.start();
        rappingThread2.start();

        try {
            rappingThread1.join();
            rappingThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        Runnable runnableSet = new Runnable() {
            public void run() {
                System.out.println("=== 세트 상품 포장 시작 ===");
                for (int i = 1; i <= 5; i ++) {
                    System.out.println("세트 상품 포장 " + i + "/5");
                }
                System.out.println("=== 세트 상품 포장 완료 ===");
            }
        };

        Thread runnable = new Thread(runnableSet);
        runnable.start();

    }
}

class Present{
    public int number = 1;
    synchronized public void rap(String name){
        System.out.println(name + " 상품 준비 " + number + "/5");
        number++;
    }


}
