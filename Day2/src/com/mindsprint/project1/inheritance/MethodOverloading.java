package com.mindsprint.project1.inheritance;

public class MethodOverloading {
    public int add(int a,int b){
        return a+b;
    }

    public float add(float a,float b){
        return a+b;
    }

    public double add(double a,double b){
        return a+b;
    }

    public int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        System.out.println(m.add(6.7,8.9));
        System.out.println(m.add(23,89));
        System.out.println(m.add(1,2,3));
        System.out.println(m.add(5.3f,4.5f));


    }
}
