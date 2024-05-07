package com.JavaTutorial;

abstract class A{
    public void call(){
        System.out.println("Calling A");
    }
    public abstract void greet();
}
class B extends A{
    public void greet(){
        System.out.println("Nameste from B");
    }
}
public class practice {
    public static void main(String[] args) {
        B b =new B();
        b.call();
        b.greet();
    }
}
