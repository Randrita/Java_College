package com.randrita.week6;

/*Create a class 'Degree' having a method 'getDegree' that prints "I got a degree". It has two subclasses namely 'Undergraduate'
 and 'Postgraduate' each having a method with the same name that prints "I am an Undergraduate" and "I am a Postgraduate" respectively.
 Call the method by creating an object of each of the three classes.*
 */

public class College {
    public static void main(String[] args) {
        Degree degree = new Degree();
        Postgraduate pDegree = new Postgraduate();
        Undergraduate uDegree = new Undergraduate();

        degree.getDegree();
        pDegree.getDegree();
        uDegree.getDegree();

    }
}

class Degree{
    void getDegree(){
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree{
    void getDegree(){
        System.out.println("I am an Undergraduate");
    }
}

class Postgraduate extends Degree{
    void getDegree(){
        System.out.println("I am a Postgraduate");
    }
}
