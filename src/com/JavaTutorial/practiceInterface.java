package com.JavaTutorial;

interface math{
    int sum(int a, int b);
    int multiply(int c,int d);
}

class calculator implements math{

    public int sum(int a,int b){
        return a+b;
    }
    public int multiply(int c,int d){
        return c*d;
    }
}
public class practiceInterface {
    public static void main(String[] args) {
        calculator c = new calculator();
        System.out.println(c.multiply(10,20));
        System.out.println(c.sum(10,20));
    }
}
