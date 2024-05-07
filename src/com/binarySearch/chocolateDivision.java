package com.binarySearch;

public class chocolateDivision {
    static boolean ifPossible(int [] arr,int stud,  int maxChocolate){
        int choco = 0;
        int count = 1;
        for (int i=0;i< arr.length;i++){
            if (arr[i] > maxChocolate) return false;
            if (choco+arr[i] <= maxChocolate){
                choco += arr[i];
            } else {
                count++;
                choco = arr[i];
            }
        }

        if(count<=stud){
            return true;
        }else{
            return false;
        }
    }
    static int chocolateDistribution(int [] arr, int n, int m){
        if (m>n){
            return -1;
        }
        int st = 1;
        int ed = (int)1e9;
        int ans = -1;

        while(st<=ed){
            int mid = st + (ed-st)/2;
            if (ifPossible(arr,m,mid)){
                ans = mid;
                ed = mid-1;
            } else {
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 4;
        int arr [] = {12,34,67,90};
        int m = 2;

        int ans = chocolateDistribution(arr,n,m);
        System.out.println(ans);

    }
}
