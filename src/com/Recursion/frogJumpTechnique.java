package com.Recursion;

public class frogJumpTechnique {
    static int bestCostFrogJump(int [] h, int n,int idx){
        if(idx==n-1) return 0;
        int opt1=bestCostFrogJump(h,n,idx+1)+Math.abs(h[idx]-h[idx+1]);
        if(idx==n-2) return opt1;
        int opt2=bestCostFrogJump(h,n,idx+2)+Math.abs(h[idx]-h[idx+2]);
        return Math.min(opt1,opt2);
    }
    public static void main(String[] args) {
        int [] arr = {10,30,40};
        System.out.println(bestCostFrogJump(arr,arr.length,0));

    }
}
