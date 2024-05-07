package com.SortingAlgorithm;
import java.util.Random;

public class quickSort {

    static int partitionPivot(int[] arr, int s, int e){
        Random rand = new Random();
        // Geting pivotIndex;
        int mid = rand.nextInt(s,e);
        int pivot = arr[mid];
        int count = 0;
        for(int i=s;i<=e;i++){
            if (arr[i] <= pivot ){
                count++;
            }
        }
        int pivotIdx = s+count-1;

        if (mid != pivotIdx) {
            // Sending Pivot Element in its Place
            int temp = arr[mid];
            arr[mid] = arr[pivotIdx];
            arr[pivotIdx] = temp;
        }




        int l = s;
        int r = e;
        while(l<pivotIdx && r>pivotIdx){
            while(arr[l]<=pivot){
                l++;
            }while(arr[r]>pivot){
                r--;
            }
            if (l<pivotIdx && r>pivotIdx){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }


        return pivotIdx;

    }

    static void quickSort(int [] arr, int st, int ed){
        if (st>=ed){
            return;
        }
        int pivotIdx = partitionPivot(arr,st,ed);
        quickSort(arr,st,pivotIdx-1);
        quickSort(arr,pivotIdx+1,ed);


    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,1,1};

        quickSort(arr,0,arr.length-1);

//        int l = partitionPivot(arr,0,arr.length-1);
//        System.out.println(l);

        for (int i:arr){
            System.out.print(i+" ");
        }

    }
}
