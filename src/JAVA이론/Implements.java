package JAVA이론;

public class Implements implements InterfaceMe,InterfaceMe2{

    @Override
    public void call() {
        System.out.println("Interface에서 작성한 메서드는 반드시 구현해야한다.");
    }

    @Override
    public void call2() {
        System.out.println("interface메서드 구현");
    }

    public static void main(String[] args) {
        Implements i = new Implements();
        i.call();
        i.call2();
    }
}
