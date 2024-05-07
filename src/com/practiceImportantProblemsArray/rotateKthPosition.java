package com.practiceImportantProblemsArray;

public class rotateKthPosition {
    static void kRotate(int arr[],int k, int n){
        reverseArray(arr,n-k,n-1);
        reverseArray(arr,0,(n-k)-1);
        reverseArray(arr,0,n-1);

    }
    static void reverseArray(int arr[],int first, int last){
        int i = first;
        int j = last;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        int k = 2;

        kRotate(arr,1,6);

        for (int i=0;i<n;i++){
            System.out.print( arr[i] + " ");
        }
        boolean bool=false;


    }
}
