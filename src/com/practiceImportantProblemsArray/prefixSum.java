package com.practiceImportantProblemsArray;


import java.util.Scanner;

public class prefixSum {
    public static int[] inPrefixSum(int []arr){
        int [] pre = new int[arr.length];
        pre[0] = arr[0];
        for (int i=1;i<arr.length;i++){
            pre[i] = pre[i-1]+arr[i];
        }
        return pre;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {2,4,1,3,6};
        int pre[] =inPrefixSum(arr);
        System.out.println("Enter Number of Queries");
        int q = sc.nextInt();
        while(q>0){
            System.out.println("Enter the Start of the range");
            int st = sc.nextInt();
            System.out.println("Enter the Last of the Range ");
            int end = sc.nextInt();
            st--;end--;
            int sum = pre[end]-pre[st-1];
            System.out.println("The sum of range "+st+" to "+end+" is: "+sum );
            q--;
        }
        long a=1000000000;
        float f = 1000.000111f;
        long b = (long)f;











    }
}
