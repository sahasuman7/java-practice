package com.recursionTutotial;

public class first {
    static int sum(int n){ //4
        // Base Case
        if (n==1){
            return n;
        }
        // Recursive Call
        int previours = sum(n-1); //3
        //Self Work
        int ans = previours+n;
        return ans;



    }


    public static void main(String[] args) {

        //Sum of N Numbers
//        int x = sum(4);
//        System.out.println(x);

        System.out.println(sum(3));


    }
}
