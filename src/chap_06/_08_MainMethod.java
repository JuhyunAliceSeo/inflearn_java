package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        for(String s: args) {
            System.out.println(s);
        }

        // 1. 도서 조회
        // 2. 도서 대출
        // 3. 도서 반납

        if(args.length ==1){ //-> args에 입력된 숫자가 1여야함
            switch (args[0]){
                case "1" :
                    System.out.println("도서 조회 메뉴입니다.");
                    break;
                case "2" :
                    System.out.println("도서 대출 메뉴입니다.");
                    break;
                case "3" :
                    System.out.println("도서 반납 메뉴입니다.");
                    break;
                default:
                    System.out.println("잘못 입력 하셨습니다.");
            }
        } else {
            System.out.println("1 ~ 3에서의 하나의 숫자를 입력하세요.");
        }
    }
}
