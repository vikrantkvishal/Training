package com.mindsprint.project1.basics;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter age:");
//        int age = sc.nextInt();
//
//        String res = (age>=18) ? "Eligible to Vote": "Not eligible to vote";
//        System.out.println(res);

        System.out.println("Enter CP");
        int cp = sc.nextInt();
        System.out.println("Enter SP");
        int sp = sc.nextInt();
        int l = cp-sp;
        System.out.println((cp>sp) ? "Loss is: " + l : "Gain is: " + -l);
    }
}
