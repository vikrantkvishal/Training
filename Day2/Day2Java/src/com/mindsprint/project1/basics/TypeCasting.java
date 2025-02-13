package com.mindsprint.project1.basics;

public class TypeCasting {
    public static void main(String[] args) {
        short data = 5;
        float data1 = data;
        System.out.println("Data1 " + data1);

        double info = 78.75;
        int info1 = (int) info;
        System.out.println("Info1 " + info1);

        char a = 'A';
        System.out.println("ASCII "+(int)a);
        System.out.println("ASCII "+(char)((int)a + 32));
    }
}
