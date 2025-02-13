package com.mindsprint.project1;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
//        int [][] arr = new int[3][];
        int[][] arr = {{1,2,3},{4,5,6,8}};

        for (int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

//        int[] a = {1,2,3,4,5};
//
//        System.out.println(Arrays.toString(a));

        for(int[] a:arr){
            for(int n:a){
                System.out.print(n + " ");
            }
            System.out.println();
        }

        int[] a = {4,2,5,1,3};

        System.out.println("Sorted Array");
        for(int i = 0;i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
        }

        for(int n:a){
            System.out.print(n + " , ");
        }

        System.out.println();
        System.out.println("Reverse Sorted Array");
        for(int i = 0;i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
        }

        for(int n:a){
            System.out.print(n + " , ");
        }

    }
}
