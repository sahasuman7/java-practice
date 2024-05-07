package com.practiceImportantProblemsArray;


// Two Pointers Approach
public class sortZerosOnes {
    static void sortArray(int []arr, int n){
        int left = 0;
        int right = n-1;
        while( left <= right ){
            if (arr[left]==3 && arr[right]==2){
                arr[left]=2;
                arr[right]=3;
                left++;right--;

            }else if (arr[left]==2){
                left++;
            } else if (arr[right]==3) {
                right--;
            }

        }
    }
    static int[] squarNonDec(int arr[],int n){
        int ans[] = new int[n];
        int left = 0;
        int right = n-1;
        int k=0;
        while(left<=right){
            if (Math.abs(arr[left]) >Math.abs(arr[right])){
                ans[k]=arr[left]*arr[left];
                left++;
                k++;
            } else{
                ans[k] = arr[right]*arr[right];
                right--;
                k++;
            }
        }

        return ans;


    }
    public static void main(String[] args) {
        int []arr={-10,-2,4,5,6};
        int ans[] = squarNonDec(arr,arr.length);






        for (int i=0;i< ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
