package chap_12;

import chap_12.clean.CleanRunnable;

public class _03_Join {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        try { //join은 쓰레드가 종료될때까지 기다렸다가 다음 cleanByBoss실행함
            thread.join(2500); //2.5초까지 대기 / 끝나지 않으면 다음으로 넘어가서 실행
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        cleanByBoss();
    }
    public static void cleanByBoss(){
        System.out.println(" -- 사장 청소 시작 -- ");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("(사장) " + i + "번방 청소중 ");

            try {
                Thread.sleep(1000); //1초 단위로 던침
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(" -- 사장 청소 끝 -- ");

    }
}
