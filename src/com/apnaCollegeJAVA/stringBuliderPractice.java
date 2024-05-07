package com.apnaCollegeJAVA;

public class stringBuliderPractice {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ABBABBA");
        StringBuilder rsb = new StringBuilder("");
        for(int i=sb.length()-1;i>=0;i--){
            rsb.append(sb.charAt(i));
        }

        if (sb.compareTo(rsb)==0){
            System.out.println("This is a Palendrome String");
        }
        else {
            System.out.println("This is not a Palendrome String");
        }
        System.out.println(sb);
        System.out.println(rsb);
    }
}
