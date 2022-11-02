package JAVA이론;

public class ConstructorTest {
    public ConstructorTest(){
        System.out.println("hello");
        //객체화시 가장 먼저 사용된다.
        //클래스명과 메소드명이 동일해야함 리턴타입이 없어야한다.
    }


    public static void main(String[] args) {
        ConstructorTest ct = new ConstructorTest();
    }
}
