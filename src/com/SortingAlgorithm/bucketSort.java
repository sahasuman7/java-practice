package com.SortingAlgorithm;
import java.util.ArrayList;
import java.util.Collections;

public class bucketSort {
    static void bucketSort(int arr[]) {
        int n = arr.length;
        ArrayList[] bucket = new ArrayList[3];

        for (int i=0;i<bucket.length;i++){
            bucket[i] = new ArrayList<>();
        }

        for (int i=0;i<arr.length;i++){
            if (arr[i] >=1 && arr[i]<=3) {
                bucket[0].add(arr[i]);
            } else if (arr[i] >=4 && arr[i]<=6) {
                bucket[1].add(arr[i]);
            } else {
                bucket[2].add(arr[i]);
            }
        }

        for (int i=0;i<3;i++){
            Collections.sort(bucket[i]);
        }

        int idx = 0;
        for (int i=0;i<bucket.length;i++){
            ArrayList<Integer> curr = bucket[i];
            for (int j = 0;j<curr.size();j++){
                arr[idx++] = curr.get(j);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,9,11,12,8,7,6,5,4,3,2,1};

        bucketSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
