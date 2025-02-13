package com.mindsprint.project1.loops;

import java.util.Scanner;

public class Activity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.print(n*i + " , ");
        }

        System.out.println();
        int a = 0;
        int b = 1;
        System.out.print(a+" , ");
        System.out.print(b+" , ");
        for(int i = 2;i<10;i++){
            int c = a+b;
            System.out.print(c+" , ");
            a = b;
            b = c;
        }

        System.out.println();
        System.out.println("Enter a number");
        n = sc.nextInt();
        if(n%2==0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");

        System.out.println();
        System.out.println("Enter 1st Number");
        a = sc.nextInt();
        System.out.println("Enter 2nd Number");
        b = sc.nextInt();

        System.out.println("The larger number is " + ((a > b) ? a : b));
    }

}
