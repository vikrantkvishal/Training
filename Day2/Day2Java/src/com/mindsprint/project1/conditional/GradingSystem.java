package com.mindsprint.project1.conditional;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int percent = sc.nextInt();
        if(percent>=70 && percent<=100)
            System.out.println("Congratulations..!! You got Distinction");
        else if(percent>=60 && percent<70)
            System.out.println("Congratulations..!! You got First Class");
        else if(percent>=50 && percent<60)
            System.out.println("Congratulations..!! You got Second Class");
        else if(percent>=35 && percent<50)
            System.out.println("Congratulations..!! You passed");
        else if(percent>=0 && percent<35)
            System.out.println("Sorry you failed");
        else
            System.out.println("Please enter a valid percentage");
    }
}
