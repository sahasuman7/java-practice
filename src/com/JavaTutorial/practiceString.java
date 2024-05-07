package com.JavaTutorial;

import java.util.Scanner;

public class practiceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter Your Digites");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter Your Choise + , - ,  * , / , %");
        char c = sc.next().charAt(0);
        switch(c){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Wrong input Try Again");
                break;
        }

        

    }
}
