package com.practiceImportantProblemsArray;

import org.w3c.dom.ls.LSOutput;

public class twoDArrayMultiplication {
    static void mul(int[][] x, int[][] y){
        if (x[0].length == y.length){
            int[][] res = new int[x.length][y[0].length];
            for (int i=0;i< res.length;i++){
                for (int j=0;j< res[0].length;j++){
                    for(int k = 0; k < y.length;k++){
                        res[i][j] += x[i][k]*y[k][j];
                    }
                }
            }

            System.out.println("Print out");

            for (int i=0;i<res.length;i++){
                for (int j=0;j<res[0].length;j++){
                    System.out.print(res[i][j]+" ");
                }
                System.out.println();
            }

        }
    }
    static void transpose(int [][]arr, int ans[][]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                ans[i][j] = arr[j][i];
            }
        }

        System.out.println("Original Matrix");

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix");

        for (int i=0;i<ans.length;i++){
            for (int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void printMatrix (int arr[][]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void squreTranspose(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }

        }
    }

    static void reverseArray(int arr[]){
        int i=0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
    static void rotateNinty(int a[][]){
        squreTranspose(a);
        for (int i=0;i<a.length;i++){
            reverseArray(a[i]);
        }
    }

    static int[][] pascle(int n){
        int ans[][] = new int[n][];
        for (int i=0;i<n;i++){
            ans[i] = new int[i+1];
            ans[i][0] = ans[i][i] =1;
            for (int j=1;j<i;j++){
                ans[i][j] = ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;
    }
    static void spiralMatrix(int[][]arr,int row, int col){
        int stRow = 0;
        int edRow = row-1;
        int stCol =  0;
        int edCol = col-1;
        int totalCount = row*col;
        while(totalCount>0){
            // stRow > stCol - edCol
            for (int j=stCol;j<=edCol && totalCount>0;j++){
                System.out.print(arr[stRow][j]+" ");
                totalCount--;
            }
            stRow++;
            // edCol > stRow - edRow
            for (int i=stRow;i<=edRow && totalCount>0;i++){
                System.out.print(arr[i][edCol]+" ");
                totalCount--;
            }
            edCol--;
            // edRow > edCol - stCol
            for (int j=edCol;j>=stCol && totalCount>0;j--){
                System.out.print(arr[edRow][j]+" ");
                totalCount--;
            }
            edRow--;
            // stCol > edRow - stRow
            for (int i=edRow;i>=stRow && totalCount>0;i--){
                System.out.print(arr[i][stCol]+" ");
                totalCount--;
            }
            stCol++;
        }
    }

    static int[][] spiralMatrixGeneration(int n){
        int ans[][] = new int[n][n];
        int count = 1;
        int stRow = 0;
        int edRow = n-1;
        int stCol = 0;
        int edCol = n-1;
        int totalElement = ans.length * ans[0].length;
        while(totalElement > 0 ){
            // stRow > stCol to edCol
            for(int i=stCol ; i<=edCol && totalElement > 0;i++){
                ans[stRow][i] = count++;
                totalElement--;
            }
            stRow++;

            // edCol > stRow to edRow
            for(int i=stRow ;i<=edRow && totalElement > 0;i++){
                ans[i][edCol] = count++;
                totalElement--;
            }
            edCol--;

            // edRow > edCol to stCol
            for(int i=edCol;i>=stCol && totalElement > 0;i--){
                ans[edRow][i] = count++;
                totalElement--;
            }
            edRow--;

            // stCol > edRow to stRow
            for (int i=edRow;i>=stRow && totalElement > 0;i--){
                ans[i][stCol]=count++;
                totalElement--;
            }
            stCol++;
        }
        return ans;
    }
    static int sumOf2DArray(int arr[][],int l1,int r1, int l2, int r2){
        int sum=0;
        int pre[][] = new int[arr.length][arr[0].length];
        for (int i=0;i<arr.length;i++){
            pre[i][0] = arr[i][0];
            for (int j=1;j<arr[0].length;j++){
                pre[i][j]=pre[i][j-1]+arr[i][j];
            }
        }


        for (int i=l1;i<=l2;i++) {
            if (r1 > 0) {
                sum += pre[i][r2] - pre[i][r1 - 1];
            } else {
                sum += pre[i][r2];
            }

        }

        return sum;
    }
    static int sumof2D(int arr[][],int l1, int r1, int l2, int r2){
        int ans[][] = new int[arr.length][arr[0].length];
        int sum=0;
        for (int i=0;i<arr.length;i++){
            ans[i][0]=arr[i][0];
            for (int j=1;j<arr[0].length;j++){
                ans[i][j] = ans[i][j-1]+arr[i][j];
            }
        }

        for (int j=0;j<arr[0].length;j++){
            ans[0][j]=ans[0][j];
            for (int i=1;i<arr.length;i++){
                ans[i][j] = ans[i][j]+ans[i-1][j];
            }
        }
        int up=0,left = 0,upleft =0;

        if (l1>=1){
            up = ans[l1-1][r2];
        }
        if (r1>=1){
            left = ans[l2][r1-1];
        }
        if (l1 >=1 && r1 >=1){
            upleft = ans[l1-1][r1-1];
        }

        sum = ans[l2][r2] - up -left +upleft;


        return sum;
    }

    public static void main(String[] args) {
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int b[][]= {{1,2},{3,4}};
//        System.out.println("Original");
//        printMatrix(a);
//        System.out.println("Transpose");
//        squreTranspose(a);
//        printMatrix(a);
//        rotateNinty(b);
//        System.out.println("90 Rotate");
//        printMatrix(b);

//        int ans[][] = pascle(10);
//        printMatrix(ans);
        int r[][] ={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int x = sumof2D(r,0,0,3,3);
        System.out.println("Sum of the Given "+x);

//1 2 3 4
//2 4 6 8
//3 6 9 12
//4 8 12 16










    }
}
