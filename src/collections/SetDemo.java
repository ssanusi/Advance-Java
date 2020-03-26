package collections;

import java.lang.reflect.Array;
import java.util.*;

public class SetDemo {
    public static void show(){
        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));
        //Union
        set1.addAll(set2);
        System.out.println(set1);

        Set<String> set3 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set4 = new HashSet<>(Arrays.asList("b", "c", "d"));

        //Intersection
        set3.retainAll(set4);
        System.out.println(set3);

        Set<String> set5 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set6 = new HashSet<>(Arrays.asList("b", "c", "d"));

        set5.removeAll(set6);
        System.out.println(set5);





    }
}
