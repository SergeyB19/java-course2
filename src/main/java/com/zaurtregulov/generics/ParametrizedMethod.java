package com.zaurtregulov.generics;

import java.util.ArrayList;

public class ParametrizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
// ArrayListal1 = new ArrayList();
        int i = al1.get(0);
        //int i =(Integer) al1.get(0);


        al1.add(10);
        al1.add(20);
        al1.add(5);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("abc");
        al2.add("def");
        al2.add("ghi");
        String s = GenMethod.getSecondElement(al2);
        System.out.println(s);
    }
}

class GenMethod {

    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }

}
