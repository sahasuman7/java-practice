package com.stringsTopic;

public class builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("sUman");
//        str.append(" Debolina");
//        System.out.println(str);
//
//        str.setCharAt(5,'+');
//        str.deleteCharAt(0);
//        str.reverse();
//        str.delete(0,5);
//        System.out.println(str.indexOf("um"));
//        int x = (int) 'A';
//        System.out.println(x);
//        System.out.println(str);
        for (int i=0;i<str.length();i++){
            if (((int)str.charAt(i)) >= 97){
                int a = ((int)str.charAt(i)) - 32;
                char x = (char)a;

                str.setCharAt(i,x);
            }else {
                int a = ((int)str.charAt(i)) + 32;
                char x = (char)a;

                str.setCharAt(i,x);

            }
        }
        System.out.println(str);










    }
}
