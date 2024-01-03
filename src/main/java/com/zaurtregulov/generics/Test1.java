package com.zaurtregulov.generics;

import java.util.List;
import java.util.ArrayList;


public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
//        list.add("OK");
//        list.add(5);
//        list.add(new StringBuilder("jjjj"));
//        list.add(new Car());
        list.add("privet");
        list.add("poka");
        list.add("ok");
        list.add("ccc");
//        list.add(new Car());

        for (Object o : list) {
            System.out.println(o + " dlina " + ((String) o).length());
        }
    }
}

class Car {

}