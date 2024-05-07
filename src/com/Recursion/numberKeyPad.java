package com.Recursion;

public class numberKeyPad {
    static void keyPad(String s, String[]kp, String res){
        if (s.length()==0){
            System.out.print(res+ " ");
            return;
        }
        int curr =  s.charAt(0)-'0';
        String currString = kp[curr];

        for (int i=0;i<currString.length();i++){
            keyPad(s.substring(1),kp,res+currString.charAt(i));
        }

    }
    public static void main(String[] args) {
        String s = "237";
        String []kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        keyPad(s,kp,"");

    }
}
 