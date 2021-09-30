package com.randrita.week2;

//3. Write a Java program to print the result of the following operations.
//        Test Data:
//        a. -5 + 8 * 6
//        b. (55+9) % 9
//        c. 20 + -3*5 / 8
//        d. 5 + 15 / 3 * 2 - 8 % 3

public class Operations {
    int a,b,c,d;
    public static void main(String[] args) {
        Operations obj = new Operations();
        obj.display();
    }

    Operations(){
        a= -5 + 8 * 6;
        b= (55+9) % 9;
        c=20 + -3*5 / 8;
        d=5 + 15 / 3 * 2 - 8 % 3;
    }

    void display(){
        System.out.println("The output of expression a is : "+a);
        System.out.println("The output of expression b is : "+b);
        System.out.println("The output of expression c is : "+c);
        System.out.println("The output of expression d is : "+d);
    }
}
