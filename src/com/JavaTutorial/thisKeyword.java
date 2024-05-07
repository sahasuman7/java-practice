package com.JavaTutorial;
abstract class Animal{
    String name;
    Animal (String name){
        this.name = name;
        System.out.println(name);
    }
    abstract void makeSound();



}
class Dog extends Animal{

    Dog(String n){
        super(n);
    }

    void makeSound(){

        System.out.println("Dog Barks");

    }


}

public class thisKeyword {


    public static void main(String[] args) {
        Animal a = new Dog("Pet");
        a.makeSound();



    }
}
