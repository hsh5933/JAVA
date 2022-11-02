package JAVA이론;

public class ParameterExample {
    public void MethodTest(String name, int age, String remark){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("remark"+remark);
    }

    public static void main(String[] args) {
        ParameterExample pe = new ParameterExample();
        pe.MethodTest("철수",20,"특징");
//      파라미터는 메소드를 호출할때 같이 끼워보내는 내용
    }
}
