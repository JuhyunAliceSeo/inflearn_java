package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        //링크드 리스트
        LinkedList<String> list = new LinkedList<>();

        //데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        //데이터 조회
        System.out.println(list.get(0)); //유재석 get(index순번)
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("-------------");

        System.out.println(list.getFirst()); //유재석
        System.out.println(list.getLast()); //강호동

        System.out.println("-------------");

        //추가
        list.addFirst("서장훈");
        for(String s : list){
            System.out.println(s);
        }

        System.out.println("-------------");

        list.addLast("김희철");
        for(String s : list){
            System.out.println(s);
        }

        System.out.println("-------------");

        System.out.println("학생 추가 전 : " + list.get(1));
        list.add(1,"김영철"); //1위치에 있는 자리에 김영철 추가
        System.out.println("학생 추가 전 : " + list.get(1));
        System.out.println("학생 추가 전 : " + list.get(2));

        System.out.println("-------------");


        //처음학생과 마지막 학생이 전학
        System.out.println("남은학생(전학 전)");
        for(String s : list){
            System.out.println(s);
        }
        list.removeFirst();
        list.removeLast();
        System.out.println("------");
        System.out.println("남은학생(전학 후)");
        for(String s : list){
            System.out.println(s);
        }

        System.out.println("-------------");

        //변경 (수강권 양도)
        list.set(0, "이수근");
        System.out.println(list.get(0));

        System.out.println("-------------");

        // 확인
        System.out.println(list.indexOf("김종국"));
        if(list.contains("김종국")){
            System.out.println("수강 신청 성공");
        } else{
            System.out.println("수강 신청 실패");
        }

        System.out.println("-------------");

        //전체 삭제
        list.clear();
        if(list.isEmpty()){
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("-------------");

        //새로운 학기
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        Collections.sort(list); //정렬
        for(String s : list){
            System.out.println(s);
        }

    }
}
