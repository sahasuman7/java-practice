package com.binarySearch;
import java.util.Scanner;

public class squrerootbinarySearch {
    static float squreRootWithPricisions(int n, int pri){

        int st = 1;
        int ed = n;
        int ans = -1;
        while(st<=ed){
            int mid = st + (ed - st)/2;
            if (mid*mid == n){
                ans = mid;
                return ans;
            } else if (mid * mid > n ) {
                ed = mid-1;
            } else {
                st = mid+1;
                ans = mid;
            }
        }

        double answer = ans;

        double increment = 0.1;
        for (int i=0;i<pri;i++){
            while (answer * answer <= n){
                answer+=increment;
            }

            answer -=increment;
            increment /= 10;
        }

        return (float)answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for Square root");
        int n  = sc.nextInt();
        System.out.println(squreRootWithPricisions(n,10));


    }
}
