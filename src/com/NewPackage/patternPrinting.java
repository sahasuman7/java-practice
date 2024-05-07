package com.NewPackage;

public class patternPrinting {
    public static void main(String[] args) {


//               1
//              212
//             32123
//            4321234
//           543212345
//        int  n=5;
//        for(int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j=i;j>=1;j--){
//                System.out.print(j);
//            }
//            for (int j=2;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=2*i-1; j++){
                if (i==n){
                    System.out.print(" * ");
                }
                else {
                    if(j==1 || j==2*i-1 ){
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }

            }
            System.out.println();
        }
        for (int i=n-1;i>=1;i--){
            for (int j = 1;j<=n-i;j++){
                System.out.print("   ");
            }
            for (int j= 1;j<=2*i-1;j++){
//                if(j==1 || j==2*i-1 ){
//                    System.out.print(" * ");
//                } else {
//                    System.out.print("   ");
//                }
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}