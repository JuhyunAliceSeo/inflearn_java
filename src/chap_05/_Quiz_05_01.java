package chap_05;

public class _Quiz_05_01 {
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

        int shoeSize[] = new int[10];
        for (int i = 0; i < shoeSize.length; i++) {
            shoeSize[i] = 250 + (5 * i);
            System.out.println("사이즈 " + shoeSize[i] + " (재고 있음)");
        }

    }
}
