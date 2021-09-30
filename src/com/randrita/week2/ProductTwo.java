package com.randrita.week2;
import java.util.Scanner;

//Write a Java program that takes two numbers as input and display the product of two numbers.

public class ProductTwo {
    int c;
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Enter One Number : ");
        int i = input.nextInt();
        System.out.print("Enter Another Number : ");
        int j = input.nextInt();

        ProductTwo s = new ProductTwo(i,j);
        s.display();
    }

    ProductTwo(int k, int m){
        c= k*m;
    }
    void display(){
        System.out.println("The Product is: "+c);
    }
}
