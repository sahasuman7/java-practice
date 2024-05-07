package com.apnaCollegeJAVA;

import java.util.Scanner;

class suman{
    void printName(){
        System.out.println("Suman Saha made this code");
    }
}


public class newClass {

    static int sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        x= sc.nextInt();
        y = sc.nextInt();
        int ans = sum(x,y);
        System.out.println(ans);


    }
}
