package com.practiceImportantProblemsArray;

public class secondLargestElement {
    static int maximum(int[] arr,int n){
        int mx = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    static int findSecondLargest(int n, int[] arr) {
        // Write your code here.
        int max = maximum(arr,n);
        for(int i=0;i<n;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=Integer.MIN_VALUE){
                int ans = maximum(arr,n);
                return ans;
            }
        }
        return -1;

    }

    static int secondSmallestElement(int arr[], int n){
        int s = Integer.MAX_VALUE;
        int xs= Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if (arr[i]<s){
                xs = s;
                s = arr[i];

            } else if (arr[i]<xs && arr[i]!=s){
                xs = arr[i];
            }
        }
        if (xs == Integer.MAX_VALUE){
            return -1;
        } else{
            return xs;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2};





    }
}
