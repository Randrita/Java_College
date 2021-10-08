package com.randrita.week3;
import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Area obj = new Area();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the length of the side of the square: ");
        int x= input.nextInt();
        System.out.println("The area of the square is: " + obj.area(x));

        System.out.print("Enter the length and breadth of the of the rectangle: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("The area of the rectangle is: " + obj.area(a,b));
    }

    static class Area{
        int area(int x){
            return x*x;
        }

        int area(int x, int y){
            return x*y;
        }
    }
}
