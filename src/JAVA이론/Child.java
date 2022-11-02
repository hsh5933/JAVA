package JAVA이론;

public class Child extends Parent{
    //부모클래스의 메서드와 자식클래스의 메서드이름이 동일한경우
    //자식클래스의 메서드가 실행된다. 이게 오버라이딩
    public void call(){
        System.out.println("자식 클래스의 메서드");
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.call();
    }
}
