package com.ssanusi;

import collections.*;
import generics.GenericList;
import generics.User;
import generics.Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //ExceptionDemo.show();

        //generics
        System.out.println("############################ Generics ###################");
        var list = new GenericList<Integer>();
        list.add(1);
        list.add(3);

        var user1 = new User(10);
        var user2 = new User(20);
        if(user1.compareTo(user2) > 0)
            System.out.println("user1 > user2");

        else if(user1.compareTo(user2) == 0)
            System.out.println("user1 equals user2");

        else
            System.out.println("user1 is less than user2");

        var max = Utils.max(1,5);
        System.out.println(max);

        Utils.print("K", 12);

        //Collection Framework
        System.out.println("############################ Collection Framework ###################");
        var list2 = new GenericList<String>();
        list2.add("a");
        list2.add("b");
        for(var item : list2)
            System.out.println(item);
        System.out.println("############################ Collection Interface ###################");
        CollectionsDemo.show();

        System.out.println("############################ List Interface ###################");
        ListDemo.show();

        List<Family> familyList = new ArrayList<>();
        familyList.add(new Family("sanusi", 31, "sanusi@sulaiman.com"));
        familyList.add(new Family("zulihat", 33, "zulihat@sulaiman.com"));
        familyList.add(new Family("tahir", 29, "tahir@sulaiman.com"));
        familyList.add(new Family("shehu", 27, "shehu@sulaiman.com"));
        familyList.add(new Family("abdul-hakeem", 39, "abdulhakeem@sulaiman.com"));
        familyList.add(new Family("rukkayat", 35, "rukayyah@sulaiman.com"));
        familyList.add(new Family("munirat", 23, "munirah@sulaiman.com"));
        familyList.add(new Family("khadijah", 25, "khadijah@sulaiman.com"));
        familyList.add(new Family("zainab", 37, "zainab@sulaiman.com"));
        familyList.add(new Family("ibrahim", 21, "ibrahim@sulaiman.com"));
        Collections.sort(familyList);
        System.out.println(familyList);
        Collections.sort(familyList, new EmailComparator());
        System.out.println(familyList);

        System.out.println("############################ Queue Interface ###################");
        QueueDemo.show();

    }
}
