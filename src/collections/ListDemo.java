package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show(){
        List<String> list =  new ArrayList<>();
        Collections.addAll(list, "sanusi", "bashir","fatima", "sanusi");
        System.out.println(list);
        System.out.println(list.indexOf("sanusi"));
        System.out.println(list.lastIndexOf("sanusi"));
        System.out.println(list.subList(0, 2));

    }
}
