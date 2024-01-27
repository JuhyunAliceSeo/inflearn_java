package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터
        List<String> list = new ArrayList<>();
        //List<String> list2 = new LinkedList<>();->똑같이 술수 있음
        list.add("유재석");
        list.add("(알 수 없음)");
        list.add("김종국");
        list.add("(알 수 없음)");
        list.add("강호동");
        list.add("(알 수 없음)");
        list.add("박명수");
        list.add("(알 수 없음)");
        list.add("조세호");

        for(String s : list){
            System.out.println(s);
        }
        System.out.println("-----------------------");

        Iterator<String> it = list.iterator(); //ctrl + alt + v
        System.out.println(it.next()); // 유재석
        System.out.println(it.next()); // (알 수 없음)
        System.out.println(it.next()); // 김종국
        System.out.println(it.next()); // (알 수 없음)
        System.out.println(it.next()); // 강호동
        System.out.println("-----------------------");

        //커서를 다시 처음 위치로 이동
        it = list.iterator();
        while (it.hasNext()){ //it에 커서가 다음에 존재하는지 불리안
            System.out.println(it.next());
        }
        System.out.println("-----------------------");

        //삭제
        it = list.iterator();
        while (it.hasNext()){ //it에 커서가 다음에 존재하는지 불리안
            String s = it.next();
            if(s.contains("(알 수 없음)")){
                it.remove(); //삭제
            }
        }
        // 삭제된 후 다시 찍어낼때
        it = list.iterator();
        while (it.hasNext()){ //it에 커서가 다음에 존재하는지 불리안
            System.out.println(it.next());
        }
        System.out.println("-----------------------");

        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");
        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }
        System.out.println("-----------------------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("박명수", 5);

        //map.iterator() //제공되지 않음.
        Iterator<String> itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }
        System.out.println("-----------------------");

        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }
        System.out.println("-----------------------");

        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator(); //키와 밸류가 셋으로 오게 됨.
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }
        System.out.println("-----------------------");

    }
}
