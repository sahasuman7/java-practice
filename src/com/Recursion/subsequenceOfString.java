package com.Recursion;
import java.util.ArrayList;

public class subsequenceOfString {
    static ArrayList<String> findSSQ(String s){
        ArrayList<String> ans = new ArrayList<>();
        if (s.length()==0){
            ans.add("");
            return ans;
        }
        char st = s.charAt(0);
        ArrayList<String> smallAns = findSSQ(s.substring(1));

        for (String so :
                smallAns) {
            ans.add(so);
            ans.add(st+so);
        }

        return ans;
    }

    static void findSubSQ(String s, String ans){
        if (s.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char currChar = s.charAt(0);
        String rem = s.substring(1);
        findSubSQ(rem, ans+currChar);
        findSubSQ(rem, ans);
    }

    static void findCombSum(int []arr, int ans, int idx){
        if (idx == arr.length){
            System.out.print(ans+" ");
            return;
        }
        int f = arr[idx];
        findCombSum(arr, ans+f, idx+1);
        findCombSum(arr, ans,idx+1);
        
    }





    public static void main(String[] args) {
        String s = "abc";
        System.out.println(findSSQ(s));
        findSubSQ(s,"");
        System.out.println();




    }
}
