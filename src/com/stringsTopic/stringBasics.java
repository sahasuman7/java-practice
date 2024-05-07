package com.stringsTopic;

import java.lang.reflect.Array;

public class stringBasics {
    public static void main(String[] args) {
        String a = "ABCDEF";
        String b = "ABCD";


//        System.out.println(a);
//        System.out.println(b);
//        a = a.concat(b);
//        System.out.println(a);
//
//        System.out.println(b+10+10);

//        System.out.println(a.substring(1));
//        System.out.println(a.substring(1,4));

        // All the Substring of an String
//        for(int i=0;i <= b.length();i++){
//            for(int j=i+1;j<=b.length();j++){
//                System.out.print(b.substring(i,j)+" ");
//            }
//        }

        String A = "suman";
        String B = "suman";
        String c = "suman";
        int hash = A.hashCode();
        System.out.println(hash);
        System.out.println(B.hashCode());
        System.out.println(c.hashCode());

        System.out.println(A==c);








    }
}
