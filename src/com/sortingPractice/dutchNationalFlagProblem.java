package com.sortingPractice;

public class dutchNationalFlagProblem {
    static void dutch(int arr[]){
        int low = 0, mid = 0, high = arr.length-1;

        while(mid<=high){
            if (arr[mid] == 0){
                if (low==mid){
                    low++;
                    mid++;
                } else{
                    swap(arr,mid,low);
                    low++;
                    mid++;
                }
            }

            else if (arr[mid] == 1){
                mid++;
            }

            else {
                swap(arr,mid, high);
                high--;
            }
        }
    }

    static void swap(int []arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
    static void displayArray(int []arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= {2,2,1,1,2,2,2,0,0,1,1,0,0};
        displayArray(arr);
        dutch(arr);
        displayArray(arr);


    }
}
