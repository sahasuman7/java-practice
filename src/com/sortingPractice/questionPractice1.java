package com.sortingPractice;

public class questionPractice1 {
    static void moveZeros(int arr[]){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if (arr[j]==0 && arr[j+1]!=0){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;

                }
            }
        }

    }

    static void sortStringArray(String[] arr){
        int minIdx;
        int n= arr.length;

        for (int i=0;i<n-1;i++){
            minIdx = i;
            for (int j=i+1;j<n;j++){
                if (arr[minIdx].compareToIgnoreCase(arr[j])>0){
                    minIdx = j;
                }
            }
            String t = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = t;
        }

    }
    public static void main(String[] args) {
//        int arr[] = {0,5,0,3,42,1};
//        moveZeros(arr);
//
//        for (int i:arr){
//            System.out.print(i+" ");
//

        String s[] = {"Zoya","papaya","Lime","watermelon","apple","kiwi","lime","mango"};
        String a[] = {"Apple","Animal","11Asia","Africa","Analogy"};


        sortStringArray(s);
        for (String i:s){
            System.out.print(i+" ");
        }
        System.out.println();




    }
}
