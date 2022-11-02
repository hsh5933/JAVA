package JAVA이론;

public class ReturnVoidTest {
    public String returnMethod(String paramValue){
        String returnValue = paramValue;
        return returnValue;
    }

    public void voidMethod(){
        System.out.println("noreturn");
    }

    public static void main(String[] args) {
        ReturnVoidTest rvt = new ReturnVoidTest();
        System.out.println(rvt.returnMethod("김치"));
        rvt.voidMethod();
    }
}
