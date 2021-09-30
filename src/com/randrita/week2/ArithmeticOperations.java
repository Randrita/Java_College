package com.randrita.week2;
import java.util.Scanner;

//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
//Test Data:
//Input first number: 125
//Input second number: 24

public class ArithmeticOperations {
    int c,k,m,d,e,f;
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter One Number : ");
        int i = input.nextInt();
        System.out.print("Enter Another Number : ");
        int j = input.nextInt();
        ArithmeticOperations s = new ArithmeticOperations(i,j);
        s.display();
    }

    ArithmeticOperations(int k, int m){
         c= k+m;
         d=k-m;
         e=k*m;
         f=k/m;
    }

    void display(){
        System.out.println("The result of sum, subtraction, product and division are: "+c+" "+d+" "+e+" "+f);
    }
}
