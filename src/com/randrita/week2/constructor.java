package com.randrita.week2;

public class constructor {
    public static void main(String[] args) {
        A obj = new A();
        obj.abc(5,"1st");
        obj.abc("2nd",5);

    }

    static class A{
        void abc(int a, String b){
            System.out.println("I'am 1st programme");
        }

        void abc( String b, int a){
            System.out.println("I'am 2nd programme");
        }
    }
}

