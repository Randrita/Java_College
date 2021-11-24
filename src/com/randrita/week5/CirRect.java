package com.randrita.week5;

public class CirRect {
    public static void main(String[] args) {
        Shapee s = new Shapee();
        Shapee s1 = new Shapee("Orange",true);
        s1.toString();
        Circle c = new Circle();
        c.setRadius(5);
        System.out.println("Perimeter of circle is:" + c.getPerimeter(c.getRadius(5)));
        System.out.println("Area of circle is:" + c.getArea(c.getRadius(5)));

        Rectangle r = new Rectangle();
        r.setLength(5);
        r.setWidth(10);
        System.out.println("Perimeter of rectangle is:" + r.getPerimeter(5,5));
        System.out.println("Area of rectangle is:" + r.getArea(5,5));

        Square sq = new Square(5);
        System.out.println("Perimeter of square is:" + sq.getPerimeter());
        System.out.println("Area of square is:" + sq.getPerimeter());


    }
}

class Shapee {
    String color;
    boolean filled;

    Shapee() {
        color = "green";
        filled = true;
    }

    Shapee(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String colorSet) {
        this.color = colorSet;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        if (filled == true) {
            return true;
        } else {
            return false;
        }
    }

    public void setFilled(boolean filledSet) {
        this.filled = filledSet;
    }

    public String toString() {
        String isNot = "";
        if (isFilled() == false) {
            isNot = "not ";
        }
        return "A Shape with color of " + color + " and is " + isNot + " filled. ";
    }
}

class Circle extends Shapee{
    double radius;
    Circle(){
        this.radius=1.0;
    }
    Circle(double radius,String color,boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getRadius(double radius){
        return this.radius;
    }

    public double getArea(double radius){
        return (Math.PI*this.radius*this.radius);
    }

    public double getPerimeter(double radius){
        return (Math.PI*this.radius*2);
    }

    public String toString(){
        String s = "A Circle with radius" + radius + "which is a subclass of" + super.toString();
        return s;
    }


}

 class Rectangle extends Shapee{
    double width;
    double length;

     Rectangle()
     {
         super();
         width = 1.0;
         length = 1.0;
     }

     Rectangle(double width, double length)
     {
         super();
         this.width = width;
         this.length = length;
     }


     Rectangle(double width,double length,String color,boolean filled){
        super (color, filled);
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
    }
    //for width
    public double getWidth(double width){
        return width;
    }

    public void setWidth(double width){
        this.width=width;
    }

    //for length
    public double getLength(double length){
        return length;
    }

    public void setLength(double length){
        this.length=length;
    }

    public double getArea(double width,double length){
        return (this.width*this.length);
    }

    public double getPerimeter(double width,double length){
        return (2*this.width+2*this.length);
    }

    public String toString(){
        String s = "A Rectangle with width " + width+" and length "+length + " which is a subclass of" + super.toString();
        return s;
    }
}

class Square extends Rectangle
{

    public Square()
    {
        super();
        double side = 1.0;
    }

    public Square(double side)
    {
        super(side, side);
        side =side;
    }

    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
        side =side;
    }

    public double getSide()
    {
        return super.getWidth(10);
    }

    public void setSide(double side)
    {
        super.setLength(side);
        super.setWidth(side);
    }

    public double getArea()
    {
        return getSide()*getSide();
    }

    public double getPerimeter()
    {
        return 4*getSide();
    }


    public String toString()
    {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }
}