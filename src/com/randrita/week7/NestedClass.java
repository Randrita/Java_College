package com.randrita.week7;

class Outer {
    class Inner{
        class NestedInner{
            void display(){
                System.out.println("Hello!I am the Nested Class Method!");
            }
        }

    }
    void display(){
        Inner.NestedInner variable = new Inner().new NestedInner();
        variable.display();
    }
}

public class NestedClass {
    public static void main(String[] args) {
        Outer variableOuter = new Outer();
        variableOuter.display();

    }
}
