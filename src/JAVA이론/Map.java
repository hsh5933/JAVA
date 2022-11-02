package JAVA이론;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        /* Map의 특징 - key와 value는 한쌍으로 key로식별 value에 사용값넣는형식
                        key는 중복불가 동일한key값적용시 최근값이 적용된다.

                        - Map안에 값넣기
                        Map.put(key,value);
                        - Map안에 값 가져오기
                        Map.get(key);
                        - Map 크기 확인
                        Map.size();
                        - Map안에 내용 변경하기
                        Map.replace(key,value);
                        - Map안에 특정 key, value들었는지 확인
                        Map.containsKey(key);
                        Map.containsValue(value);
                        - Map안에 내용삭제
                        Map.remove(key)
                        -
        * */
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        map.put("김치", 1000);
        map.put("갓김치",10000);
        map.put("총각김치",100000);

        System.out.println("Map Value : "+ map.get("김치"));
        System.out.println("Map size : "+ map.size()); //맵 크기확인

        map.replace("김치",500); //key값의 내용을 변경
        System.out.println("김치 value : "+map.get("김치"));

        //김치값이 존재하는지 확인
        System.out.println("key값이 존재하는지 확인 : "+map.containsKey("김치"));
        //value값이 존재하는지 확인
        System.out.println("value값 존재확인 : "+map.containsValue(10000));

        //map크기가 0인지 확인
        System.out.println("map empty : "+map.isEmpty());
    }
}
