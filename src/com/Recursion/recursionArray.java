package com.Recursion;

public class recursionArray {
    static void printArr(int arr[], int idx){
        if (idx==0){
            System.out.print(arr[idx]+" ");
            return;
        }
        printArr(arr,idx-1);
        System.out.print(arr[idx]+" ");
    }
    static void printArrr(int arr[], int idx){
        if (idx == arr.length-1){
            System.out.print(arr[idx]+" ");
            return;
        }
        printArrr(arr,idx+1);
        System.out.print(arr[idx]+" ");
    }
    static int maxValue(int arr[], int idx){
        if (idx == arr.length-1){
            return arr[idx];
        }
        return Math.max(arr[idx], maxValue(arr,idx+1));
    }
    static int sumOfArray(int arr[], int idx){
        if (idx == arr.length-1){
            return arr[idx];
        }
        return arr[idx]+sumOfArray(arr,idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        printArr(arr,arr.length-1);
        System.out.println();
        printArrr(arr,0);
        System.out.println();
        System.out.println(maxValue(arr,0));
        System.out.println(sumOfArray(arr,0));
        String n = "Suman";
        System.out.println(n.charAt(4));
        String x ="asumansumansuman";
        x = x.replace("suman","");


        System.out.println("x "+ x);


//        LeetCode : Alpha2beta

    }
}
