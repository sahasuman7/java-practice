package com.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class program {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        System.out.println(l1);

        int n = l1.size();
        int i = 0;
        int j = n-1;
        while(i<j){
            int temp = l1.get(i);
            l1.set(i, l1.get(j));
            l1.set(j,temp);
            i++;
            j--;

            n--;
        }
//        System.out.println(l1);
//        System.out.println(l1.remove(Integer.valueOf(30)));
//        System.out.println(l1);
//        l1.add(2,30);
//        System.out.println(l1);

        ArrayList <String> s=new ArrayList<>();
        s.add("Suman");
        s.add("Saha");
        s.add("Soma");
        s.add("Shah");

        System.out.println(s);
        Collections.sort(s);
        System.out.println(s);





    }
}

