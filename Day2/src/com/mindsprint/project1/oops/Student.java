package com.mindsprint.project1.oops;

public class Student {
    int id;
    String name;
    String email;
    String address;

    public Student() {
    }

    public Student(String name, String email, String address) {
//        this((int) Math.round(Math.random() * 10000), name, email, address);
        this.id = (int) Math.round(Math.random()*10000);
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public Student(int id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

//    public void display(){
//        System.out.println("ID: "+this.id);
//        System.out.println("Name: "+this.name);
//        System.out.println("Email: "+this.email);
//        System.out.println("Address: "+this.address);
//    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alex","alex@gmail.com","US");
        Student s3 = new Student(1001,"Bobby","bobby@gmail.com","UK");

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }
}
