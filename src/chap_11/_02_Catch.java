package chap_11;

public class _02_Catch {
    public static void main(String[] args) {
        try {
            //시도하려는 소드 코드
            //System.out.println(3/0);

//            int[] arr = new int[3];
//            arr[5] = 100;

//            Object obj = "test";
//            System.out.println((int) obj);

            String s = null;
            System.out.println(s.toLowerCase());
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { //두개를 같이 예외조건으로 할수도 있음.
            System.out.println("뭔가 실수 하셨네요.");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("인덱스를 잘못 설정했네요");
        } catch (ClassCastException e){
            System.out.println("잘못된 형 변환입니다.");
        } catch (Exception e){ //->exception 은 모든 에러의 조상
            //문제가 생길시 캐치문에서 해결
            System.out.println(" 그 외의 모든 에러난 여기서 처리가 되요. " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}
