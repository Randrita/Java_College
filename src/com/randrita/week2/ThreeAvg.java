package com.randrita.week2;

import java.util.Scanner;
//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

public class ThreeAvg {
    int sum;
    public static void main(String[] args) {
        int[] arr=new int[3];
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the array element : ");
        for (int i=0;i<3;i++){
            arr[i]=input.nextInt();
        }

        ThreeAvg s= new ThreeAvg(arr);
        s.display();
    }

    ThreeAvg(int[] arr){
        sum=0;
        for (int i:arr){
            sum=i+sum;
        }
    }

    void display(){
        System.out.println("The sum is : "+sum/3);
    }
}
