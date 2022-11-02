package JAVA이론;

public class ImpleInterface implements InterExample{

    @Override
    public void makeThis() {
        System.out.println("makethis call");
    }

    @Override
    public void makeThisWithParam(String name, int age) {
        System.out.println("makeThisWithParam call : "+name+" "+age);
    }

    public static void main(String[] args) {
        ImpleInterface inter = new ImpleInterface();
        inter.makeThis();
        inter.makeThisWithParam("Name",30);
    }
}
