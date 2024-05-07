package com.JavaTutorial;
class A1{
    int num =10;
    void call(){
        System.out.println("A is Calling");
    }
}
class A2 extends A1{
    void greet(){
        System.out.println(super.num);
        super.call();
        System.out.println("Welcoming from B");
    }

}

public class applicationofSuper {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);

    }
}