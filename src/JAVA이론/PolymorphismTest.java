package JAVA이론;

public class PolymorphismTest {
    public static void main(String[] args) {
        Human h = new Cheolsu();
        h.call(); //오버라이딩되어 철수클래스의 메서드 나옴
        //h.status(); human클래스에 status메서드 없어서 사용불가능
    }
}
