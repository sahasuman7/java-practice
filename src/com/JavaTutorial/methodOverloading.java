package com.JavaTutorial;

public class methodOverloading {
    static int sum(int x,int y){
        return x+y;
    }
    int multiply(int x, int y){
        return x*y;
    }

    int multiply(int x,int y, int z){
        return x*y*z;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // Because,the static method is associate with the class thatswhy we call the method without making
        // a Object of that Class
        int c = sum(a,b);
        System.out.println("Sum of "+a+" & "+b+" is "+c);

        int d = 10;
        int e = 10;

        // It is a Non-Static method that's why we have to make an object of the class to access the method
        methodOverloading obj = new methodOverloading();
        int f = obj.multiply(d,e);
        System.out.println("Multiply with 2 variables "+d+" & "+e+" is "+f);

        int g = 10;
        int h = 20;
        int i = 10;
        int j = obj.multiply(g,h,i);
        System.out.println("Multiply with 3 Variables "+g+" & "+h+" & "+ i +" is "+j);

        // Can Method Overloading by changing Argument 








    }
}
