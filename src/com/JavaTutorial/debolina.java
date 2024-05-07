package com.JavaTutorial;
class suman{
    int a;
    int b;
    suman(int a,int b){
        this.a = a;
        this.b = b;

    }
    void display(){
        System.out.println(a+b);
    }
}
public class debolina {
    public static void main(String[] args) {
        suman s = new suman(10,20);
        s.display();

    }
}
