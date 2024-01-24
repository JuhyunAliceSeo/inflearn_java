package chap_07;

import chap_07.Camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        //참조
        //기본 자료형(Primitive Data Types) : int, float, double, long, boolean
        //메소드를 가지지 않는다
        //소문자로 시작
        int[] i = new int[3];
        System.out.println(i[0]); //0


        double[] d= new double[3];
        System.out.println(d[0]); //0.0

        // 참조 자료형(Non-Primitive, Reference Data Types) : String, Camera, FactoryCam...
        //기본적으로 널값을 가지고 있다
        //메소드를 가지고 있다
        //대문자로 시작
        String[] s= new String[3];
        System.out.println(s[0]); //null

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null); //true

        ////////////////
        int a = 10;
        int b = 20;
        b = a; //값이 복사됨
        System.out.println(a);
        System.out.println(b); //10
        b=30;
        System.out.println(a);
        System.out.println(b); //30

        System.out.println("-----------");
        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name); //카메라1
        System.out.println(c2.name); //카메라2
        c2=c1; //c2의 객체의 메모리를 c1으로 향하게 됨. = 참조
        System.out.println(c1.name); //카메라1
        System.out.println(c2.name); //카메라1
        c2.name = "고장난카메라";
        System.out.println(c1.name); //고장난카메라
        System.out.println(c2.name); //고장난카메라

        changeName(c2);

        System.out.println(c1.name); //잘못된카메라
        System.out.println(c2.name); //잘못된카메라

        c2=null; //참조된걸 해제되게 하는 법
        //System.out.println(c2.name); //nullpointexception
    }

    public static void changeName(Camera camera){
        camera.name="잘못된카메라";

    }
}
