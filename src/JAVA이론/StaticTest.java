package JAVA이론;

public class StaticTest {
    static int a=10;

    public static void call(){
        System.out.println("static method call");
    }

    public static void main(String[] args) {
        System.out.println(a);
        call();
    }
}
