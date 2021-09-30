package com.randrita.week2;
//7.Write a Java program to print an American flag on the screen.

public class AmericanFlag {

    public static void main(String[] args) {
        String p2 = "==============================================";
        AmericanFlag s = new AmericanFlag();
        AmericanFlag s1 = new AmericanFlag(p2);

    }

    AmericanFlag(){
        String p1 = "* * * * * * ==================================\n* * * * * * ==================================";
        for(int i=0;i<4;i++){
            System.out.println(p1);
        }
    }

    AmericanFlag(String p2){
        for(int i=0;i<6;i++){
            System.out.println(p2);
        }
    }
}
