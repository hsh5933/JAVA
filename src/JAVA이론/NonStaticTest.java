package JAVA이론;

public class NonStaticTest {
    int a=10; //클래스메소드

    public void call(){
        System.out.println("call Method");
    }

    public static void main(String[] args) {
        NonStaticTest nst = new NonStaticTest();
        nst.call();
    }
}
