package com.randrita.week3;
import java.util.Scanner;

/*2.Create a class named 'Rectangle' with two data members- length and breadth and a method to calculate the area which is 'length*breadth'. The class has three constructors which are :
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.*/

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle x = new Rectangle();
        Rectangle y = new Rectangle(10,10);
        Rectangle z = new Rectangle(5);
        x.calculate();
        y.calculate();
        z.calculate();
    }
}

class Rectangle{
    int length;
    int breadth;

    Rectangle(){
        length=0;
        breadth=0;
    }

    Rectangle(int l,int b){
        length=l;
        breadth=b;
    }

    Rectangle(int l){
        length=l;
        breadth=l;
    }

    void calculate(){
        System.out.println("The area is : "+ (length*breadth));
    }
}
