package com.SortingAlgorithm;

public class radixSort{
    static int max(int []arr){
        int largestElement = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>largestElement){
                largestElement = arr[i];
            }
        }
        return largestElement;
    }
    static void countSort(int [] arr, int place){

//        int largestElement = max(arr);
        int [] hashArr = new int[10];

        // HASHING THE ARRAY
        for(int i=0;i< arr.length;i++){
            hashArr[(arr[i]/place)%10]++;
        }
        // Prefix Sum Hashing array
        for (int i=1;i<hashArr.length;i++){
            hashArr[i] += hashArr[i-1];
        }


        int newArr[] = new int[arr.length];

        for (int i=arr.length-1; i>=0; i--){
            int x = hashArr[(arr[i]/place)%10]-1;
            newArr[x] = arr[i];
            hashArr[(arr[i]/place)%10]--;
        }

        for (int i=0;i<arr.length;i++){
            arr[i] = newArr[i];
        }
    }

    static void displayArray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void radixSort(int arr[]){
        int max = max(arr);

        for (int i=1;max/i>0;i*=10){
            countSort(arr,i);
        }
    }
    public static void main(String[] args) {
        int arr[] ={100,3450,1,22,134};


        countSort(arr,10);
        displayArray(arr);



    }

}
