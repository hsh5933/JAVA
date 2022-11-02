package JAVA이론;

import java.util.HashSet;
import java.util.Iterator;

public class Set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>(); //set선언

        set.add("a");
        set.add("b");
        set.add("b"); //set에 중복값 저장 불가능
        set.add("c"); //set에 값 담기

        System.out.println("set크기확인 : "+set.size());

        Iterator<String> iter = set.iterator(); //set을 iterator에 담기
        while(iter.hasNext()){ //iterator에 다음값이 있다면
            System.out.println("iterator : "+iter.next()); //iter에서 값꺼내기
        }
    }
    /* Set선언하기
        -HashSet<데이터타입> set이름 = new HashSet<데이터타입>();
       Set에 값 추가하기
        - set이름.add("값");
       Set크기확인
        - set이름.size();
       Set내용 출력할수있게 Iterator에 담기
        - Iterator<데이터타입> iterator명 = set이름.Iterator();
       Iterator안에 담은 Set출력하기
       Iterator명.next(); 또는
       while(iter.hasNext()){
            System.out.println(iterator명.next()); 이경우는 갑이없을떄까지 계속출력한다
       }

    * */
}
