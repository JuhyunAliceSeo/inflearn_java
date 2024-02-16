package chap_01;

public class _Quiz_JJ {
    public static void main(String[] args) {

        /*
        주민등록번호를 숫자로 저장하고자 한다 이 값을 저장하기 위해서는 어떤 자료형 .
        (data type) ? regNo 을 선택해야 할까 라는 이름의 변수를 선언하고 자신의 주민등록번호로
        초기화 하는 한 줄의 코드를 적으시오.
        */

        long regNo = 9406122100000L;
        System.out.println(regNo);

        // ->정수형 타입으로는 보통 int형을 사용하지만, 주민등록번호는 13자리의 정수이기 때문에
        //  int형의 범위를 넘어서는 값이다. 그래서 long형을 사용해야한다. 그리고 리터럴 의 접미사 'L'을 잊어서는 안된다.

        /*
        (2)  다음의 문장에서 리터럴 변수 상수 키워드를 적으시오 , , , .
            int i = 100;
            long l =100L;
            final float PI = 3.14f;

             리터럴 :  100, 100L, 3.14f
             변수 : i, l
             상수 : PI
             키워드 : int, long, final, float

        (3) 다음 중 기본형(primitive type)이 아닌 것은? b
            a. int
            b. Byte
            c. double
            d. boolean

            ->기본형은 boolean, byte, short, char, int, long, float, double 모두 8개이다. 그 외의 타입은 모두 참조형(reference type)이다

        (4) 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오류’라고 적으시오.
            System.out.println(“1” + “2”) → ( 12 )
            System.out.println(true + “”) → ( ture  )
            System.out.println(‘A' + 'B') → ( AB ) -> 131
            System.out.println('1' + 2) → ( 오류 ) -> 51
            System.out.println('1' + '2') → ( 12 ) -> 99
            System.out.println('J' + “ava”) → ( Java )
            System.out.println(true + null) → ( 오류 )

            ->'A'+'B' → 65 + 66 → 131 'A'와 'B'의 문자코드의 값은 각각 65와 66이다.
                '1'+2 → 49 + 2 → 51 '1'의 문자코드의 값은 49이다.
                '1'+'2' → 49 + 50 → 99
            -> 문자열 + any type → 문자열 + 문자열 → 문자열
                any type + 문자열 → 문자열 + 문자열 → 문자열
            -> 문자와 문자의 덧셈연산의 결과는 int형 정수값 된다. 왜냐하면 int형보다 작은 타입(byte, char, short)은 int형으로 변환된 후에 덧셈연산이 진행되기 때문이다.

         (5) 다음 중 키워드가 아닌 것은?(모두 고르시오) b, c, d, e
            a. if
            b. True
            c. NULL
            d. Class
            e. System

        (6) 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오) a, d, e, g
            a. $ystem
            b. channel#5
            c. 7eleven
            d. If
            e. 자바
            f. new
            g. $MAX_NUM
            h. hello@com

            -> 1. 대소문자가 구분되며 길이에 제한이 없다.
                - True와 true는 서로 다른 것으로 간주된다.
                2. 예약어를 사용해서는 안 된다.
                - true는 예약어라서 사용할 수 없지만, True는 가능하다.
                3. 숫자로 시작해서는 안 된다.
                - top10은 허용하지만, 7up는 허용되지 않는다.
                4. 특수문자는 '_'와 '$'만을 허용한다.
                - $harp은 허용되지만, S#arp은 허용되지 않는다.

        (7) 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? (모두 고르시오) a, d
            a. int
            b. long
            c. short
            d. float
            e. double

            ->모든 참조형 변수는 4 byte이므로, 크기가 4 byte인 기본형 타입을 고르면 된다.

       (8) 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오) d, e
            byte b = 10;
            char ch = 'A';
            int i = 100;
            long l = 1000L;
            a. b = (byte)i;
            b. ch = (char)b;
            c. short s = (short)ch;
            d. float f = (float)l;
            e. i = (int)ch;

        (9) char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오)
        0~65535

        (10) 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오) a, b, c, d
            a. byte b = 256;
            b. char c = '';
            c. char answer = 'no';
            d. float f = 3.14
            e. double d = 1.4e3f;

        (11) 다음 중 main메서드의 선언부로 알맞은 것은? (모두 고르시오) a
            a. public static void main(String[] args)
            b. public static void main(String args[])
            c. public static void main(String[] arv) // 매개변수 args의 이름은 달라도 됨
            d. public void static main(String[] args) // void는 반드시 main앞에 와야 한다.
            e. static public void main(String[] args) // public과 static은 위치가 바뀌어도 됨
            [정답] a,b,c,e
            [해설] 배열을 의미하는 기호인 ‘[]’는 타입 뒤에 붙여도 되고 변수명 뒤에 붙여도 되기 때문에 'String[] args'와
                  ‘String args[]'는 같은 뜻이다. 자세한 내용은 ‘5장 배열(Array)’에서 자세히 설명할 것이다

        (12) 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오) b,f
           a. boolean - false
            b. char - '\u0000'
            c. float - 0.0 // float는 0.0f가 기본값. 0.0은 0.0d에서 접미사 d가 생략된 것
            d. int - 0
            e. long - 0 // long은 0L이 기본값.
            f. String - "" // String은 참조형 타입. 모든 참조형 타입의 기본값은 null

            [정답] c,e,f
            [해설] 리터럴의 접미사는 대소문자를 구분하지 않으므로, long의 경우 'L'또는 'l'(소문
            자)을 사용할 수 있다. 'l'은 숫자 '1'과 혼동하기 쉬우므로 대문자를 사용하는 것이 좋
다.
        */


    }
}

