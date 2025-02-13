package com.mindsprint.project1.basics;

import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();
        System.out.println("Addition: "+(num1 + num2));
        System.out.println("Subtraction: "+(num1 - num2));
        System.out.println("Multiplication: "+(num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " +((float)num1 / (float)num2));
    }
}
