package chap_12;

import chap_12.clean.CleanRunnable;

public class _02_Runnable {
    //thread와의 차이?
    //인터페이스는 부모케이스 상속 가능
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        cleanByBoss();
    }

    public static void cleanByBoss(){
        System.out.println(" -- 사장 청소 시작 -- ");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("(사장) " + i + "번방 청소중 ");
        }
        System.out.println(" -- 사장 청소 끝 -- ");
    }
}
