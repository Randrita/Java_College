package com.randrita.week3;
import java.util.Scanner;

/*Write a program to print the names of students by creating a Student class. If no name is passed while creating an object of Student class, then the name should be "Unknown", otherwise the name should be equal to the String value passed while creating object of Student class.*/


public class Name {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name you want to display: ");
        String s= input.next();

        Student ans = new Student();
        Student ans1 = new Student(s);

        ans.display();
        ans1.display();

    }
}

class Student{
    String name;

    Student(String s){
        name=s;
    }

    Student(){
        name = "unknown";
    }

    void display(){
        System.out.println("The ans is: "+ name);
    }
}
