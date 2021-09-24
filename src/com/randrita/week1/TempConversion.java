package com.randrita.week1;
import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        System.out.print("Enter the temperature in celsius: ");
        Scanner input=new Scanner(System.in);
        float f = input.nextInt();
        double temp =(f*1.8)+32;
        System.out.print("The temperature in Fahrenheit: " + temp);


    }
}
