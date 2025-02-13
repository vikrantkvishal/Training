package com.mindsprint.project1.abstraction;

import java.util.Scanner;

interface PaymentMethod{
    void pay();
}
class Paypal implements PaymentMethod{
    public void pay() {
        System.out.println("Payment done using Paypal");
    }
}
class RazorPay implements PaymentMethod{
    public void pay() {
        System.out.println("Payment done using RazorPay");
    }
}

public class Payment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your Payment Method");
        String method = sc.next();
        PaymentMethod pm = null;
        if(method.equals("Paypal")){
            pm = new Paypal();
        }
        else{
            pm = new RazorPay();
        }
        pm.pay();
    }
}
