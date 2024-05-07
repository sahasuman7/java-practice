package com.Recursion;
import java.util.Scanner;

public class firstRecursion {

    //Printing Numbers in Decreasing Order
    static void printNumber(int n){
        if (n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printNumber(n-1);
    }

    // Factorial Of A given Input
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int x = fact(n-1);
        return n*x;
    }

    static int fibo(int n){
        if (n <= 1 ){
            return n;
        }
        int x = fibo(n-1)+fibo(n-2);
        return x;
    }
    static void printFibo(int n){
        for(int i=0;i<n;i++){
            System.out.print(fibo(i)+" ");
        }
    }

    static int sumOfDigitgs(int n){
        if(n / 10 == 0){
            return n;
        }
        int last = n%10;
        return sumOfDigitgs(n/10)+last;
    }
    static int powPQ(int p, int q){
        if (q==0){
            return 1;
        }
        if (q==1){
            return p;
        }
        return p*powPQ(p,q-1);
    }
    static void table(int n, int k){
        if (k==1){
            System.out.print(n+" ");
            return;
        }
        table(n,k-1);
        System.out.print((n*k)+" ");
    }
    static int alternateSign(int n){
        if (n==0){
            return 0;
        }
        if (n%2 == 0){
            return alternateSign(n-1)-n;
        }else {
            return alternateSign(n-1)+n;
        }
    }


    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        System.out.println("Enter a Power");
//        int p= sc.nextInt();
//        int q=sc.nextInt();


//        printNumber(n);
//        System.out.println(fibo(n));
//        printFibo(n);
//        System.out.println(powPQ(p,q));
//        table(p,q);
        System.out.println(alternateSign(4));
    }

}
