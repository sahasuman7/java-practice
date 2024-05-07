package com.binarySearch;

public class smallestElementinRotatingArray {
    static int smallestRotate(int [] arr){
        int st = 0;
        int ed = arr.length-1;
        int ans = -1;
        int n = arr.length-1;
        while(st<=ed){
            int mid = st + (ed-st)/2;
            if (arr[mid]>arr[n-1]){
                st = mid+1;
            } else if(arr[mid] <= arr[n-1]){
                ans = mid;
                ed = mid-1;
            }
        }
        return ans;
    }
    static int findElementRotatedArray(int[] arr, int target){
        int st=0;
        int ed = arr.length-1;

        while(st<=ed){
            int mid = st + (ed - st)/2;
            if (arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < arr[ed]){
                if (target > arr[mid] && target <= arr[ed]){
                    st = mid+1;
                } else{
                    ed = mid-1;
                }
            } else {
                if(target >= arr[st] && target < arr[mid]){
                    ed = mid-1;
                } else {
                    st = mid+1;
                }
            }
        }
        return -1;

    }
    static int findDuplicateElementRotatedArray(int[] arr, int target){
        int st=0;
        int ed = arr.length-1;

        while(st<=ed){
            int mid = st + (ed - st)/2;
            while(arr[st] == arr[mid] && arr[mid] == arr[ed] && st<=ed){
                st++; ed--;
            }
            if (arr[mid] == target){
                return mid;
            }
            else if(arr[mid] <= arr[ed]){
                if (target > arr[mid] && target <= arr[ed]){
                    st = mid+1;
                } else{
                    ed = mid-1;
                }
            } else {
                if(target >= arr[st] && target < arr[mid]){
                    ed = mid-1;
                } else {
                    st = mid+1;
                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,1,1,1,1,2,3,4,1,1,1};
        System.out.println(findDuplicateElementRotatedArray(arr,4));
        System.out.println(4%5);

    }
}
