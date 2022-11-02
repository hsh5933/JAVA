package JAVA이론;

public class ExceptionTest {
    public void call(int j){
        try{
            int[] i = {1,2,3};
            System.out.println("call value : "+ i[j]);
        }catch (Exception e){
            System.out.println("배열에 맞는값 입력");
            e.printStackTrace();
        }finally {
            System.out.println("해당문장은 무조건 수행");
        }

    }

    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        et.call(4);
    }
}
