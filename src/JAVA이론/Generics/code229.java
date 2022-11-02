package JAVA이론.Generics;

import com.sun.security.jgss.GSSUtil;

class Data<T>{
     T obj;
     Data(T ob){
        this.obj = ob;
     }

    public T getObj() {
        return obj;
    }

    void showType(){
        System.out.println("Type of T : "+obj.getClass().getName());
    }
}
public class code229 {
    public static void main(String[] args) {
        Data<Integer> d1 = new Data<Integer>(100); // 정수 100인 인수
        System.out.println(d1.getObj());
        d1.showType();

        Data<String> d2 = new Data<String>("JAVA");
        System.out.println(d2.getObj());
        d2.showType();
    }


}
