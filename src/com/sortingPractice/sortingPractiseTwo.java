package com.sortingPractice;

public class sortingPractiseTwo {

    //
    static void swappingTwoElementsinASortedArray(int arr[]){
        int n = arr.length;
        int f = -1;
        int s = -1;
        boolean flag = false;

        if (n <=1 ) return;

        for (int i=1;i<n;i++){
            if (arr[i-1]>arr[i]){
                if (!flag) {
                    f = i-1;
                    s = i;
                    flag = true;
                }else {
                    s=i;
                }
            }
        }
        if (flag){
            int t = arr[f];
            arr[f] = arr[s];
            arr[s]  = t;
        }


    }
    static void positiveNegetivePartition(int []arr){
        int n = arr.length;

        int l = 0;
        int r = n-1;

        while(l<r){
            while(arr[l]<0) l++;
            while(arr[r]>0) r--;
            if (arr[l]>0 && arr[r]<0 && l<r){
                int t = arr[l];
                arr[l] = arr[r];
                arr[r] = t;
            }
        }
    }
    static void displayArray(int []arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {4,-6};

        displayArray(arr);

        positiveNegetivePartition(arr);

        displayArray(arr);

    }
}
