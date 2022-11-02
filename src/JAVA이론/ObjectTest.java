package JAVA이론;

public class ObjectTest {
    int i=10;

    public static void main(String[] args) {
       // System.out.println(i); 객체가없어서 오류
        ObjectTest ot = new ObjectTest();
        System.out.println(ot.i);
    }
}
