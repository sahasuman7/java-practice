package com.apnaCollegeJAVA;

public class multiDimentionalArray {
    static void printArray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static void bubbleSort(int arr[], int n){
        for(int i=0;i<n-1;i++){
            boolean flag= false;
            for (int j=0;j<n-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
    }

    static void selectionSort(int arr[], int n){
        int minIdx;
        for (int i=0;i<n-1;i++){
            minIdx = i;
            for (int j=i+1;j<n;j++){
                if (arr[minIdx] > arr[j]){
                    minIdx = j;
                }
            }
            int t = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = t;


        }
    }



    static void insertionSort(int []arr){
        int n = arr.length;
        for (int i=1;i<n;i++){
            for (int j=i;j > 0 && arr[j]<arr[j-1];j--){
                    int t = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=t;
                }
            }
        }

    public static void main(String[] args) {
        int arr[] = {1,2,7,3,4};
        int n = arr.length;
        printArray(arr);
        System.out.println();
        insertionSort(arr);
        printArray(arr);






    }
}
