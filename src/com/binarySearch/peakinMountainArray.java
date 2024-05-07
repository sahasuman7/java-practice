package com.binarySearch;

public class peakinMountainArray {
    static int findingPeakMountainArray(int[]arr){
        int st = 0;
        int ed = arr.length-1;
        int ans = -1;
        while (st<=ed){
            int mid = st+ (ed-st)/2;
            if (arr[mid] < arr[mid+1]){
                ans = mid+1;
                st  = mid+1;
            } else {
                ed = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,111,1};
        System.out.println(findingPeakMountainArray(arr));
    }
}
