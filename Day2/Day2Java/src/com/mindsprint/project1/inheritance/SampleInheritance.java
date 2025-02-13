package com.mindsprint.project1.inheritance;

class Parent {
    public String name = "Test";
    public Parent(){
        System.out.println("Parent Constructor");
    }
    public void hello(){
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Child Constructor");
    }
    public void print(){
        System.out.println("Welcome "+name);
    }
}

public class SampleInheritance {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.print();
        ch.hello();
        System.out.println(ch.name);
    }
}
