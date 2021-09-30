package com.randrita.week2;
import java.util.Scanner;

//Write a Java program to print the sum of two numbers.

public class SumTwoNum {
    int c;
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Enter One Number : ");
        int i = input.nextInt();
        System.out.print("Enter Another Number : ");
        int j = input.nextInt();

        SumTwoNum s = new SumTwoNum();
        SumTwoNum s1 = new SumTwoNum(i,j);
        s1.display();
    }

    SumTwoNum(){
        System.out.print("The sum is: ");
    }

    SumTwoNum(int i,int j){
        c= i+j;
    }

    void display(){
        System.out.println(c);
    }
}
