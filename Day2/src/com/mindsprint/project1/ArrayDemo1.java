package com.mindsprint.project1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array1 = new int[5];
        String[] names = {"test1","test2","test3"};

//        System.out.println(Arrays.toString(names));

        for(int i = 0;i<names.length;i++){
            System.out.println(names[i]);
        }
        System.out.println();
        for(String s:names){
            System.out.println(s);
        }

        System.out.println();
        System.out.println("Storing Values in an empty array");

        for (int i = 0;i<array1.length;i++){
            System.out.println("Enter any number");
            array1[i] = sc.nextInt();
        }

        for (int j : array1) {
            System.out.print(j + " ");
        }
    }
}
