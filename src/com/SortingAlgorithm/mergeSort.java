package com.SortingAlgorithm;



public class mergeSort {

    static void merge(int arr[], int l, int m, int r){

        // Length of Divided array Extraction
        int left = m-l+1;
        int right = r-m;

        //New Array Creation of Respective Length
        int leftArray[] = new int[left];
        int rightArray[] = new int[right];

        //First Array Value Feeding
        for (int i=0;i<left;i++){
            leftArray[i] = arr[l+i];
        }

        //Second Array Value Feeding
        for (int i=0;i<right;i++){
            rightArray[i] = arr[m+1+i];
        }

        //Three Pointer Declaration
        int i=0, j = 0 , k = l;

        //Lopping to traverse the array for marge the array into main array
        while(i<left && j<right){
            if (leftArray[i]<=rightArray[j]){
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        //For Remaining Element of leftArray
        while(i<left){
            arr[k++] = leftArray[i++];
        }


        while(j<right){
            arr[k++] = rightArray[j++];
        }



    }
    static void margeSort(int [] arr, int l, int r){
        if(l>=r){
            return;
        }
        int mid = (l+r)/2;
        margeSort(arr,l,mid);
        margeSort(arr,mid+1,r);
        merge(arr, l, mid,r);


    }
    public static void main(String[] args) {
        int arr[] = {3,4,1,9,2};
        int st = 0;
        int ed = arr.length-1;
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

        margeSort(arr,st,ed);
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
