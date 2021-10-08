package com.randrita.week2;
//7.Write a Java program to print an American flag on the screen.

public class AmericanFlag {
    String p1, p2;

    public static void main(String[] args) {

        AmericanFlag s = new AmericanFlag();
        s.display();
        s.display1();
    }

    AmericanFlag() {
        p1 = "* * * * * * ==================================\n* * * * * * ==================================";
        p2 = "==============================================";
    }

    void display() {
        for (int i = 0; i < 2; i++) {
            System.out.println(p1);
        }
    }

    void display1(){

        for (int j = 0; j < 6; j++) {
            System.out.println(p2);
        }
    }
}
