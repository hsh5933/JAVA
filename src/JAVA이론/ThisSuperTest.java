package JAVA이론;

public class ThisSuperTest {
    int value = 10;

    public ThisSuperTest(int value){
                            //value만 붙이게되면 밑에 value를 받아 사용
                            //this.value는 클래스영역의 변수가 들어오게된다.
        System.out.println(this.value);
    }

    public static void main(String[] args) {
        ThisSuperTest tst = new ThisSuperTest(1);
    }

    /* this란 클래스영역에서 정의한 변수와 동일한 이름의 변수가 사용되는경우
        this.를 붙여 클래스 영역에 정의한 변수를 사용한다

       super란 클래스내에 동일한 이름의 메소드,변수가 있어도
        super.를 붙여 상속받은 클래스의 메소드, 변수를 사용한다.
    * */
}
