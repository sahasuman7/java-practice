package com.oopsProgramming;
import java.util.*;

class suman{
    public static int num(int x){
        return x;
    }


}

public class firstOops {
    // DRY -->>  Don't Repeat Yourself
    public static int maxVal(int x, int y){
        if(x>y){
            return x;
        } else{
            return y;
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c = maxVal(a,b);
//        System.out.println("Addition of Two Digit "+c);
//
//         a=sc.nextInt();
//         b=sc.nextInt();
//         c = maxVal(a,b);
//        System.out.println("Addition of Two Digit "+c);
//
//         a=sc.nextInt();
//         b=sc.nextInt();
//         c = maxVal(a,b);
//        System.out.println("Addition of Two Digit "+c);
//
//         a=sc.nextInt();
//         b=sc.nextInt();
//         c = maxVal(a,b);
//        System.out.println("Addition of Two Digit "+c);


        suman pumpi = new suman();

        int x = pumpi.num(5);
        System.out.println(x);







    }
}
