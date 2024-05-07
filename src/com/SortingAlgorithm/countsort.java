package com.SortingAlgorithm;

public class countsort {
    static int max(int []arr){
        int largestElement = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>largestElement){
                largestElement = arr[i];
            }
        }
        return largestElement;
    }
    static int[] countSort(int [] arr){

        int largestElement = max(arr);
        int [] hashArr = new int[largestElement+1];

        // HASHING THE ARRAY
        for(int i=0;i< arr.length;i++){
            hashArr[arr[i]]++;
        }
        // Prefix Sum Hashing array
        for (int i=1;i<hashArr.length;i++){
            hashArr[i] += hashArr[i-1];
        }


        int newArr[] = new int[arr.length];

        for (int i=arr.length-1; i>=0; i--){
            int x = hashArr[arr[i]]-1;
            newArr[x] = arr[i];
            hashArr[arr[i]]--;

        }
        return newArr;
    }
    public static void main(String[] args) {
        int [] arr = {290,20,24,2,2,1,1,1};
//        int max_element = 2;

        int newArr[]=countSort(arr);

        for (int i:newArr){
            System.out.print(i+" ");
        }
    }
}
