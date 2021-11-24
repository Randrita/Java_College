package com.randrita.week7;

/*Show that an inner class has access to the private elements of
its outer class. Determine whether the reverse is true*/

public class OuterClass {

    private int k=5;
    class InnerClass{
        void display(){
            System.out.println("The number defined in outerClass is "+ k);
        }

    }

    void show(){
        InnerClass inner = new InnerClass();
        inner.display();
    }

    public static void main(String[] args) {
       OuterClass number = new OuterClass();
       number.show();

    }
}
