package JAVA이론;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        LinkedList<String> list2 = new LinkedList<>();

        list2.add("E");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add(0,"D"); //0번째 값에 D값을 추가
        System.out.println("List값 확인 : "+list);
        System.out.println("List값 인덱스 확인 : "+list.get(0));

        list.remove(2); //2번 인덱스의 값 삭제
        list.remove("B"); //B라는 값 삭제

        list.set(0,"Z"); //list값 변경 (인덱스, 변경할값)
        System.out.println("list크기확인 : "+list.size());

        System.out.println("list안에 특정값 있는지 확인 : "+list.contains("B"));

        System.out.println("list안에 아무것도 없는지 확인 : "+list.isEmpty());

        /* 리스트
            - 크기를 자유롭게 설정 가능 (배열은 처음 크기를 설정하면 변경불가. 리스트는 삽입 삭제를 원하는 대로 가능하다.)
            - 배열은 직접엑세스, list는 순차액세스만 가능하다.
        * */

    }
}
