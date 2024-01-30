package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        //쓰레드 : 우리가 만드는 프로그램을 해서 실행되는걸 프로세스 / 작업을 수행하는건 쓰레드
        // 프로세스는 여러개의 쓰레드를 가질수 있음(처리를 할시).

        // 1 3 5 7  9
        // 2 4 6 8 10

        //cleanBySelf();

        CleanThread cleanThread = new CleanThread();
        //cleanThread.run(); //run이아니라 start로 해야 동시에 여러개의 쓰레드 작업 수행이 가능함
        cleanThread.start();

        cleanByBoss();

    }

    public static void cleanBySelf(){
        System.out.println(" -- 혼자서 청소 시작 -- ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("(혼자) " + i + "번방 청소중 ");
        }
        System.out.println(" -- 혼자서 청소 끝 -- ");

    }

    public static void cleanByBoss(){
        System.out.println(" -- 사장 청소 시작 -- ");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("(사장) " + i + "번방 청소중 ");
        }
        System.out.println(" -- 사장 청소 끝 -- ");

    }
}
