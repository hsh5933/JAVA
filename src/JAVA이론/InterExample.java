package JAVA이론;

public interface InterExample {
    //인터페이스는 특성상 메소드안의 내용을 구현하지못한다.
    //외형만 만들고 인터페이스를 사용하는 클래스에서 내용을 구현한다.

    public void makeThis(); //Interface에 정의후 implements하면 강제구현
    public void makeThisWithParam(String name, int age);
}
