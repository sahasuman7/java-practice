package com.binarySearch;

public class binarySearchin2DMatrix {
    static boolean binarySearch(int[][] arr, int target){
        int n = arr.length;
        int m = arr[0].length;
        int st = 0;
        int ed = (n*m)-1;
        while(st<=ed){
            int mid = st + (ed-st)/2;
            if (arr[mid/m][mid%m]==target){
                return true;
            } else if (target > arr[mid/m][mid%m]) {
               st = mid+1;
            }else {
                ed= mid-1;
            }
        }
        return false;
    }

    static boolean twoDBinarySearch(int arr[][], int target){
        int m = arr.length;
        int n = arr[0].length;
        int st_row = 0;
        int st_col = n-1;
        while( st_row < m && st_col >=0 ){
            int mid = arr[st_row][st_col];
            if (mid==target){
                return true;
            } else if (target > mid){
                st_row++;
            } else {
                st_col--;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        int arr[][] = {{2,4,6,8},{5,6,7,20},{7,11,13,25},{12,14,17,30}};
        System.out.println(twoDBinarySearch(arr, 34));

    }
}
