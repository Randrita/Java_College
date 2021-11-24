package com.randrita.week6;

/*A class has an integer data member 'i' and a method named 'printNum' to print thevalue of 'i'.
Its subclass also has an integer data member 'j' and a method named 'printNum' to print the value of 'j'.
Make an object of the subclass and use it to assign a value to 'i' and to 'j'. Now call the method 'printNum'
by this object.*/

public class PrintNum {
    int i;
    void printNum(int i){
        this.i=i;
        System.out.println("The number presents in PARENT Class is: "+i);
    }

    public static void main(String[] args) {
       SubClass child = new SubClass();
       child.printNum(10);
    }
}

class SubClass extends PrintNum{
    int j;

    @Override
    void printNum(int j){
        super.printNum(5);
        this.j=j;
        System.out.println("The number presents in CHILD Class is: "+j);
    }
}
