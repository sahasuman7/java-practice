package com.Recursion;

public class recursionInString {
    static String removeChar(String s, int idx, char x){
        String ans = "";
        if (idx == s.length()){
            return ans;
        }

        if (s.charAt(idx)!=x){
            ans+=s.charAt(idx);
        }
        return ans+removeChar(s,idx+1,x);
    }

    static String reverseString(String s, int idx){
        String ans="";
        if (idx == s.length()){
            return ans;
        }
        return reverseString(s,idx+1)+s.charAt(idx);
    }

    static String removeCharWithoutIndex(String s, char x){
        if (s.isEmpty()){
            return "";
        }
        String part = s.substring(1);
        String small = removeCharWithoutIndex(part,x);
        if (s.charAt(0)!=x){
            return s.charAt(0)+small;
        }else {
            return small;
        }
    }



    static boolean palindromeCheck(String s, int l, int r){
        if (l==r || l>r){
            return true;
        }

        if (s.charAt(l) == s.charAt(r)){
            return palindromeCheck(s,l+1,r-1);
        } else {
            return false;
        }
    }




    public static void main(String[] args) {
        String s = "levrvel";
        System.out.println(palindromeCheck(s,0,s.length()-1)) ;

    }
}
