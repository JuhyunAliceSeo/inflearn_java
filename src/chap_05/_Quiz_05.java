package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        /*
        배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램을 작성하시오

        신발사이즈는 250부터 295까지 5단위 증가
        신발 사이즈 수는 총 10가지

        실행결과
        사이즈 250 (재고 있음)
        사이즈 255 (재고 있음)
        ...
        사이즈 295 (재고 있음)
        */

        int shoesSize[] = new int[10];
        for (int i = 0; i < shoesSize.length; i++) {
            shoesSize[i] = 250 + (5*i); //값을 정의
        }

        for (int i = 0; i < shoesSize.length; i++) {
            System.out.println("사이즈 " + shoesSize[i] + " (재고 있음)");
        }System.out.println();


        //for each문
        for (int size : shoesSize){
            System.out.println("사이즈 " + size + " (재고 있음)");
        }

    }
}
