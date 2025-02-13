package com.mindsprint.project1.oops;

public class Student2 {
    String name;
    int[] grades = new int[5];
//    float avg;

    public Student2(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
//        this.avg = average();
    }

    public float average(int[] grades){
        int sum = 0;
        for(int n:grades){
            sum+=n;
        }
        return (float) sum /5;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Grades");
        for(int n:grades){
            System.out.print(n + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2("AA", new int[]{43, 43, 42, 45, 49});
        Student2 s2 = new Student2("BB", new int[]{42, 23, 41, 44, 35});

        float avg1 = s1.average(s1.grades);
        float avg2 = s2.average(s2.grades);

        s1.display();
        System.out.println(avg1);
        s2.display();
        System.out.println(avg2);
    }

}
