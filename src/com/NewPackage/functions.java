package com.NewPackage;


import java.util.Scanner;

class tryArray{
    void arrPrograms(){
        int arr[] = {10,20,2,34,5};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>ans){
                ans=arr[i];
            }
        }
        System.out.println(ans);


    }
}

public class functions {
    public static int  factorial(int num){
        if (num == 0 || num==1){
            return 1;
        }
        return num*factorial(num-1);
    }
    static int lastOccerence(int[] arr,int x){
        int index=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                if (i>index){
                    index=i;
                }
            }
        }
        return index;
    }
    static int targetSumBasic(int[] arr, int t){
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==t){
                    count++;
                }
            }
        }
        return count;
    }

    static int firstRepeatedElement(int arr[]){
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    static int lastRepeatingElement(int arr[]){
        for (int i=arr.length-1;i>=0;i--){
            for (int j = i-1;j>=0;j--){
                if (arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    static void reverseArray(int arr[],int n){
        int i=0;
        int j= n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static int[] rotateKth(int arr[], int k){
        int newArray[] = new int[arr.length];
        int j=0;
        int n= arr.length;
        for (int i=n-k;i<n;i++){
            newArray[j++]=arr[i];
        }
        for (int i=0;i<n-k;i++){
            newArray[j++]=arr[i];
        }
        return newArray;
    }
    static void freqArray(int arr[],int n,int x){
        int [] freq = new int[20];

        for (int i=0;i<n;i++){
            freq[arr[i]]++;
        }

        for (int i=0;i<20;i++){
            System.out.print(freq[i]+" ");
        }

        if (freq[x] >= 1){
            System.out.println( "Present");
        } else {
            System.out.println("Absent");
        }



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);







    }
}
