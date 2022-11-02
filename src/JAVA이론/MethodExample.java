package JAVA이론;

public class MethodExample {
    public String test_method(String send){
        System.out.println("method inside");
        String send_value = send+"값 들어옴";
        return send_value;
    }

    public static void main(String[] args) {
        MethodExample me = new MethodExample();
        System.out.println(me.test_method("Power"));
    }
}
