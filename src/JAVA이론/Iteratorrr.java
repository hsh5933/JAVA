package JAVA이론;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iteratorrr {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>(Arrays.asList("a","b","c","d","e","f"));
        Iterator<String> iter = arrList.iterator();
        while(iter.hasNext()){
            String str = iter.next();
            System.out.println("iter 값 : "+str);
        }
    }
}
