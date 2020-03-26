package com.ssanusi;

import collections.CollectionsDemo;
import exceptions.ExceptionDemo;
import generics.GenericList;
import generics.User;
import generics.Utils;

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

        CollectionsDemo.show();

    }
}
