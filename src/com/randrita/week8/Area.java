package com.randrita.week8;

public class Area {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c    = new Circle();

        System.out.println("The area of Rectangle: "+ r.calculate(10,10));
        System.out.println("The area of Circle: "+ c.calculate(5,5));
    }
}

interface  A {
    public double calculate(double x,double y);
}

class Rectangle implements A{
    @Override
    public double calculate(double x, double y) {
        return x*y;
    }
}

class Circle implements A{
    public double calculate(double x,double y){
        return x*x*Math.PI;
    }
}
