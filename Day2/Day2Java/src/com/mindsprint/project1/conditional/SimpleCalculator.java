package com.mindsprint.project1.conditional;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter first number");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number");
            double num2 = sc.nextDouble();

            System.out.println("Enter \n+ for addition\n- for subtraction\n* for multiplication\n/ for division ");

            String input = sc.next();
            switch (input){
                case "+":
                    System.out.println("Addition "+ (num1+num2));
                    break;
                case "-":
                    System.out.println("Subtraction "+ (num1-num2));
                    break;
                case "*":
                    System.out.println("Multiplication " + (num1 * num2));
                    break;
                case "/":
                    System.out.println("Division "+ (num1/num2));
                    break;
                default:
                    System.out.println("Please choose a valid option");
            }
            System.out.println("Enter 1 to continue press any other key to exit");
            String op = sc.next();
            if(op.equals("1"))
                continue;
            else
                break;
        }
    }
}
