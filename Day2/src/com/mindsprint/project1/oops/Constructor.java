package com.mindsprint.project1.oops;

public class Constructor {
    public Constructor(){
        super();
        System.out.println("Constructor is called");
    }

    public static void main(String[] args) {
        Constructor c = new Constructor();
//        new Constructor();
    }

}
