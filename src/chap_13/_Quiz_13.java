package chap_13;

import java.io.*;
import java.util.Scanner;

public class _Quiz_13 {
    public static void main(String[] args) {
        /*
        속담 퀴즈 프로그램을 작성하시오

        조건
         퀴즈 내용은 saying.txt라는 이름의 파일로 제공
         퀴즈는 문제와 정담이 각각 한줄로 구성
         사용자로부터 값을 입력받아 정답여부 확인
         오답인 경우 정답 안내
         퀴즈내용이 더이상 없을때까지 반복
        */

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("saying.txt"))) { //APPEND : 수정을 안하고 추가 되는지
            bw.write("세 살 __ 여든까지 간다");// 내용이 덮여쓰임
            bw.newLine();
            bw.write("버릇");
            bw.newLine();
            bw.write("소 잃고 __ 고친다");
            bw.newLine();
            bw.write("외양간");
            bw.newLine();
            bw.write("천 리 길도 한 __부터");
            bw.newLine();
            bw.write("걸음");
            bw.newLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Scanner sc = new Scanner(System.in);
        try(BufferedReader br = new BufferedReader(new FileReader("saying.txt"))) { //APPEND : 수정을 안하고 추가 되는지
            System.out.println("속담 퀴즈입니다. 빈칸에 알맞은 말을 입력하시오 (주관식)");
            System.out.println("----------------------------------------------");

            String quiz;
            String answer;
            String input;

            while(true){
                quiz = br.readLine();
                answer = br.readLine();
                if(quiz == null || answer ==null){
                    break;
                }

                System.out.println("(문제) " + quiz);
                System.out.println("  정답 입력 => ");
                input = sc.next();
                if(input.equals(answer)){
                    System.out.println("정답입니다!!");
                } else{
                    System.out.println("틀렸습니다. 정답은 " + answer + "입니다.\n");
                }
            }

            System.out.println("----------------------------------------------");
            System.out.println("모든 퀴즈가 완료되었습니다.");
            System.out.println("수고하셨습니다.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
