package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25;
        int move = 0;
        int height = 2;

        while(move + height < distance){
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착했습니다");

        System.out.println("----반복문 #1----");
        //키가 엄청나게 큰사람?
        move =0;
        height = 25;
        while(move + height < distance){
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착했습니다");

        //Do While 반목문
        /*
        do{
        }while(조건);
        -> do를 먼저 한번 수행하고 while 조건이 맞을때까지 함
        */
        do{
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }while(move + height < distance);
        System.out.println("도착했습니다");
    }
}
