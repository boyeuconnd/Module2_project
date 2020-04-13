package com.codegym;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    //constructor to initialize the variable
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    //static method to change the value of static variable
    static void change() {
        college = "AnhHungXaDieu";
    }

    //method to display values
    void display() {
        System.out.printf("%3d %-7s %15s \n",rollno,name,college);
    }
}
