package com.JavaTutorial;

import java.util.Scanner;

public class newClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        while(i<=20){
            System.out.println(i+" HELLO WORLD");
            i++;
        }
//        Infinite Loop
//        for ( ; ; ){
//            System.out.println("Debolina Saha Wife of Suman Saha");
//        }

        int marks,r;
        do {
            System.out.println("Enter 1 to Continue 0 to break ");
            r = sc.nextInt();
            if (r==0){
                break;
            } else {
                System.out.println("Enter Your Marks");
                marks = sc.nextInt();
                if (marks >= 90){
                    System.out.println("This is Good");
                } else if (marks >= 60 && marks <= 89){
                    System.out.println("This is also Good");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("This is Good As Well");
                }
            }
        } while (true);
//        int i=0;
//
//        while( i > 0 ){
//            System.out.println("Loop");
//        }
//
//        do {
//            System.out.println("Loop");
//        } while (i>0);



    }
}
