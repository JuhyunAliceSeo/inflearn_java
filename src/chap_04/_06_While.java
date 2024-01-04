package chap_04;

public class _06_While {
    public static void main(String[] args) {
        //반복문 While
        //수영장에서 수영을 하는 모습
        int distance = 25; //전체거리 25m
        int move = 0;
        /*
        while (조건){

        }*/
        while (move < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도작하였습니다.");

        //무한루프
        move = 0;
        while (move < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
        }
        System.out.println("도작하였습니다.");
    }
}
