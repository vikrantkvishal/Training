package com.mindsprint.project1.inheritance;

class ParentPhone{
    public void call(){
        System.out.println("Parent Phone is calling");
    }
}
class ChildPhone extends ParentPhone{
    public void call(){
        super.call();
        System.out.println("Child Phone is calling");
        super.call();
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        ChildPhone ch = new ChildPhone();
        ch.call();
        System.out.println();
    }
}
