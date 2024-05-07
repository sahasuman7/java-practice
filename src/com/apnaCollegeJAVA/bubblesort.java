package com.apnaCollegeJAVA;

public class bubblesort {
    public static void main(String[] args) {
        int arr[] = {5,2,3,1,3};
        int l = arr.length;
        System.out.println(l);

        for(int i=0;i<l;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for (int i=0; i<l-1; i++){
            for (int j=0;j<l-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }

        for(int i=0;i<l;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
