package JAVA이론;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamStudy {
    public static void main(String[] args) {
        //배열 스트림
        String[] arr = new String[]{"a","b","c"};
        Stream<String> stream = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr,1,3);

    }
}
