package com.sarvesh.javabasics;
public class StudentApp {
    static class Student {
        String name;
        int age;
        double marks;
        
        Student(String name, int age, double marks) {
            this.name = name;
            this.age = age;
            this.marks = marks;
        }
        void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Marks: " + marks);
        }
        void isPassed() {
            if (marks >= 40) {
                System.out.println("Result: Passed");
            } else {
                System.out.println("Result: Failed");
            }
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Sarvesh", 20, 75);
        s1.displayDetails();
        s1.isPassed();
    }
}