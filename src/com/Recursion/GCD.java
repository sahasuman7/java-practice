package com.Recursion;

public class GCD {
    static int gcd(int m, int n){
        if (m%n==0){
            return n;
        }
        int a = m%n;

        return gcd(n,a);
    }
    static int uclidGCD(int m, int n){
        if (n==0){
            return m;
        }
        return uclidGCD(n,m%n);
    }
    public static void main(String[] args) {
        int n = 12;
        int m = 16;
        System.out.println(gcd(m,n));
        System.out.println(uclidGCD(m,n));

    }
}
