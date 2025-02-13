package com.mindsprint.project1.abstraction;

abstract class Test{
    public abstract void display();
}
public class SampleAbs extends Test {
    @Override
    public void display() {
        System.out.println("Implemented Parent Method");
    }

    public static void main(String[] args) {
        Test t = new SampleAbs();
        t.display();
    }
}
