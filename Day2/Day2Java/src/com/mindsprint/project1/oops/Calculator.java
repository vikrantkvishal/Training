package com.mindsprint.project1.oops;

public class Calculator {
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
    public int sq(int n){
        return n*n;
    }
    public int cube(int n){
        return n*n*n;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Addition: "+c.add(43,23));
        int res = c.cube(3);
        System.out.println("Cube of 3 is: "+res);
        System.out.println("Subtraction: "+c.sub(43,23));

    }
}
