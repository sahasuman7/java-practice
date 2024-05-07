package com.Recursion;

public class linearSearchRecursion {
    static int arraySearch(int[] arr, int idx, int x){
        if (idx >= arr.length){
            return -1;
        }

        if (arr[idx]==x){
            return idx;
        }

        return arraySearch(arr,idx+1,x);
    }
    static void printIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return;
        }

        if (arr[idx] == x){
            System.out.print(idx+" ");
        }
        printIndex(arr,idx+1,x);
    }
    static boolean isSorted(int arr[], int idx){
        if (idx == arr.length-2 && arr[idx]<=arr[idx+1]){
            return true;
        }

        if (arr[idx] <= arr[idx+1]){
            return isSorted(arr,idx+1);
        }else {
            return false;
        }
    }

    static int lastIndexOfTarget(int[] arr, int idx, int x){
        if (idx == arr.length){
            return -1;
        }

        int last = -1;
        if (arr[idx]==x){
            last = idx;
        }
        return Math.max(last,lastIndexOfTarget(arr,idx+1,x));

    }
    public static void main(String[] args) {
        int []arr = {10,12,13,12,12,12,16,13,12};
//        System.out.println(arraySearch(arr,0,90));
//        printIndex(arr,0,90);
//        System.out.println(isSorted(arr,0));
        System.out.println(lastIndexOfTarget(arr,0,12));
    }
}
