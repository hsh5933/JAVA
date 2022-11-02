package JAVA이론;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        arr1[0]=10;
        arr2[2]=20;
        System.out.println("arr1[0] : "+arr1[0]);
        System.out.println("arr2[2] : "+arr2[2]);

        String[] str1 = new String[]{"A"};
        String[] str2 = {"A","B","C"};

        System.out.println("str1[0] : "+str1[0]);
        System.out.println("str2[2] : "+str2[2]);
    }
}
