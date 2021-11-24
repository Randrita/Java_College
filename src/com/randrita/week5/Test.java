package com.randrita.week5;

public class Test {
    public static void main(String[] args) {
        Shape obj1 = new Shape();
        String s =obj1.getColor();
        System.out.printf("The colour is %s and the Boolean Value of the filled condition is %b \n",obj1.getColor() , obj1.isFilled());
        System.out.println(obj1.toString());
    }
}

class Shape{
    String color;
    boolean filled;

    Shape(){
        color = "green";
        filled = true;

    }

    Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public void setColor(String colorSet) {
        this.color = colorSet;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled()
    {
        if (filled == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void setFilled(boolean filledSet)
    {
        this.filled = filledSet;
    }

    public String toString()
    {
        String isNot = "";
        if(isFilled() == false)
        {
            isNot = "not ";
        }
        return "A Shape with color of " + color + " and is " + isNot + " filled. ";
    }
}

