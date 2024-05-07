package com.binarySearch;
import java.util.Scanner;

public class binarySearchImplementation {
    static int binary(int []arr, int target){
        int st = 0, ed = arr.length-1 ;
        int mid=0;
        while(st<=ed){
            mid = (st+ed)/2;
            if (arr[mid]==target){
                return mid;
            } else if(arr[mid]<target){
                st = mid+1;
            } else {
                ed = mid-1;
            }
        }
        return -1;
    }

    static int firstOccurrence(int []arr, int target){
        int st = 0, ed = arr.length-1 ;
        int mid=0;
        int first = -1;
        while(st<=ed){
            mid = (st+ed)/2;
            if (arr[mid]==target){
                first = mid;
                ed = mid-1;
            } else if(arr[mid]<target){
                st = mid+1;
            } else {
                ed = mid-1;
            }
        }
        return first;
    }
    static int lastOccurrence(int []arr, int target){
        int st = 0, ed = arr.length-1 ;
        int mid=0;
        int last = -1;
        while(st<=ed){
            mid = (st+ed)/2;
            if (arr[mid]==target){
                last = mid;
                st = mid+1;
            } else if(arr[mid]<target){
                st = mid+1;
            } else {
                ed = mid-1;
            }
        }
        return last;
    }

    static int recursiveBinary(int []arr, int target, int st, int ed){
        if (st>ed) return -1;
        int mid = (st+ed)/2;

        if (arr[mid] == target){
            return mid;
        } else if (arr[mid]<target) {
            return recursiveBinary(arr,target,mid+1, ed);
        } else {
            return recursiveBinary(arr,target,st, mid-1);
        }
    }

    static int squre(int n, int st, int ed) {
        while(st<=ed){
            int mid = st + (ed-st)/2;
            if(mid * mid <= n){
                if (mid* mid == n){
                    return mid;
                } else {
                    if ((mid+1) * (mid+1) > n){
                        return mid;
                    } else {
                        st = mid+1;
                    }
                }
            } else if (mid * mid > n) {
                ed = mid-1;
            } else {
                st = mid+1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int arr[] = {1,2,3,3,3,3,4,5,6,7,8,9};

        // Non-Recursive Binary Search
//        System.out.println(binary(arr,9));
        // Recursive Binary Search
//        System.out.println(recursiveBinary(arr,2,0,arr.length-1));
        // Finding First Occurrence in a Sorted Array
//        System.out.println(firstOccurrence(arr,11));
//        System.out.println(lastOccurrence(arr,3));



        // Finding Squreroot of a Given Number using Binary Search
//        System.out.println("Enter the number you want the squreroot: ");
//        int n = sc.nextInt();
//        int arr[] = new int [n+1];
//        for (int i = 1;i<=n;i++){
//            arr[i] = i;
//        }
        int n = 16;
        int ans = squre(n,1,n);
        System.out.println(ans);

    }
}
