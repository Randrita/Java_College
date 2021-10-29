package com.randrita.week4;

class Blocks {
    static String k=" ";
    static {
        System.out.println("Hello! I'm Static Block! ");
    }
    Blocks(String anything){
         k = anything;
         display();
    }
    static void display(){
        System.out.println(k);
    }
}
public class Check {
    public static void main(String[] args) {
        Blocks s1 = new Blocks("Hello! Constructor Here!");
        System.out.println("I'am main block");
    }
}



