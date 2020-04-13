package com.codegym;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();//calling change method
//creating objects
        Student s1 = new Student(001, "DongTa");
        Student s2 = new Student(002, "TayDoc");
        Student s3 = new Student(003, "NamDe");
        Student s4 = new Student(004, "BacCai");
//calling display method
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }

}
