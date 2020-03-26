package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show(){
        Map<String, Family> familyMap = new HashMap<>();

        var f1 = new Family("sanusi", 31, "sanusi@sulaiman.com");
        var f2 = new Family("zulihat", 33, "zulihat@sulaiman.com");
        var f3 = new Family("tahir", 29, "tahir@sulaiman.com");
        var f4 = new Family("shehu", 27, "shehu@sulaiman.com");
        var f5 = new Family("abdul-hakeem", 39, "abdulhakeem@sulaiman.com");
        var f6 = new Family("rukkayat", 35, "rukayyah@sulaiman.com");
        var f7 = new Family("munirat", 23, "munirah@sulaiman.com");
        var f8 = new Family("khadijah", 25, "khadijah@sulaiman.com");
        var f9 = new Family("zainab", 37, "zainab@sulaiman.com");
        var f10 = new Family("ibrahim", 21, "ibrahim@sulaiman.com");
        var unknown = new Family("Unknown", 0, "");

        familyMap.put(f1.getEmail(), f1);
        familyMap.put(f2.getEmail(), f2);
        familyMap.put(f3.getEmail(), f3);
        familyMap.put(f4.getEmail(), f4);
        familyMap.put(f5.getEmail(), f5);
        familyMap.put(f6.getEmail(), f6);
        familyMap.put(f7.getEmail(), f7);
        familyMap.put(f8.getEmail(), f8);
        familyMap.put(f9.getEmail(), f9);
        familyMap.put(f10.getEmail(), f10);

        var sanusi = familyMap.get("sanusi@sulaiman.com");
        System.out.println(sanusi);
        var exists = familyMap.containsKey("sanusi@sulaiman.com");
        System.out.println(exists);
        var abdulahi =  familyMap.getOrDefault("abdullahi", unknown);
        System.out.println(abdulahi);

        for(var family : familyMap.keySet())
            System.out.println(family);

        for (var family: familyMap.values())
            System.out.println(family);

    }
}
