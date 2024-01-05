package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        //배열의 순회
        String[] coffees = {"아메리카노", "카페모카", "라뗴", "카푸치노"};

        //for 반복문 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("---------------------");

        //배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) { //배열의 길이가 얼마인지 모를경우 이용
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("--------------------");

        // enhanced for(for-each)반복문
        for (String coffee : coffees){ //coffees의 배열을 순회하는데 그떄 coffee를 순회하면서 넣겠다
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요");

    }
}
