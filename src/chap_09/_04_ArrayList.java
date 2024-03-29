package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        //컬렉션 프레임워크 : 많은 데이터를 쉽고 편리하게 관리할수있는 클래스의 모음
        // List, Set, Map

        //배열은 들어갈수있는 숫자가 정해져 있음 / 컬렉션 프레임 워크는 수가 정해져 있지 않음.
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        //Array List
        ArrayList<String> list = new ArrayList<>(); //list라는 이름의 문자열을 보관할수 있는 ArrayList가 만들어짐

        //데이터 추가 = add
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        //데이터 조회(인덱스) = get
        System.out.println(list.get(0)); //유재석 get(index순번)
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("-------------------------");

        //데이터 삭제 = remove
        System.out.println("신청 학생수 (삭제 전) : "+ list.size()); //5
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-------------------------");

        list.remove("박명수");
        System.out.println("신청 학생수 (삭제 후) : "+ list.size()); //4
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-------------------------");

        System.out.println("남은 학생수 (제외 전) : " + list.size()); //4
        list.remove(list.size() - 1);
        System.out.println("남은 학생수 (제외 후) : " + list.size()); //3
        for (String s : list){
            System.out.println(s);
        }

        // 변경 (수강권 양도) = set
        System.out.println("수강권 양도 전 : " + list.get(0)); //유재석
        list.set(0, "이수근");
        System.out.println("수강권 양도 후 : " + list.get(0)); //이수근

        System.out.println("-------------------------");

        //확인 = indexOf
        System.out.println(list.indexOf("김종국")); //2

        System.out.println("-------------------------");

        //선착순 5명 내에 포함되었는가 = contains
        if(list.contains("김종국")){
            System.out.println("수강신청 성공");
        } else {
            System.out.println("수강신청 실패");
        }

        System.out.println("-------------------------");

        //전체 삭체 = clear
        list.clear();
        if(list.isEmpty()){
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("-------------------------");

        //다음 학기에 새로 공부 시작
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        //가나다 순으로 정렬 =   Collections.sort(정렬하고싶은 데이터)
        Collections.sort(list);
        for ( String s : list ){
            System.out.println(s);
        }

    }
}
