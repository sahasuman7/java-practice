package com.binarySearch;

public class racetrackProblem {
    static boolean isPossibleStands(int[] arr, int kids, int minDist){
        int kid = 1;
        int initial = 0;
        for (int i=1;i<arr.length;i++){
            if (arr[i]-arr[initial]>=minDist){
                kid++;
                initial = i;
            }
        }
        return (kid >= kids);
    }
    static int racetrackStanding(int arr[], int n, int kids){
        int ans =-1;
        int st = 1;
        int ed = (int) 1e9;

        while(st<=ed){
            int mid = st + (ed-st)/2;
            if (isPossibleStands(arr,kids, mid)){
                ans  = mid;
                st = mid+1;
            } else {
                ed = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1,2,4,8,9};
        int kids = 3;


        System.out.println(racetrackStanding(arr,n,kids));

    }
}
