package com.randrita.week2;
//7.Write a Java program to print an American flag on the screen.

public class AmericanFlag {
    String p1, p2;

    public static void main(String[] args) {

        AmericanFlag s = new AmericanFlag();
        s.display();

    }

    AmericanFlag() {
        p1 = "* * * * * * ==================================\n* * * * * * ==================================";
        p2 = "==============================================";

    }


    void display() {
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);

            for (int j = 0; i < 6; i++) {
                System.out.println(p2);
            }

        }
    }
}
