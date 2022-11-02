package JAVA이론;

import com.sun.source.tree.Scope;

public class ScopeTest {
    String sClassVal = "Class Value"; //class영역에 선언한 변수
    static String sStaticVal = "Static Value"; //클래스 전체에 공유

    public void method1(){
        String sMethod1Val = "method1 Value"; //method영역에 선언한 변수
        System.out.println(sClassVal); //class영역 안에있는 메소드는 클래스변수 사용
    }

    public static void main(String[] args) {
        System.out.println(sStaticVal); //객체안만들고 바로사용 static붙음
        ScopeTest s = new ScopeTest();
        System.out.println(s.sClassVal);
    }
}

