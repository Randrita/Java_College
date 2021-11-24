package com.randrita.week7;

/*Create a class with an inner class that has a non default constructor (one that takes arguments). Create a
second class with an inner class that inherits from the first inner class.*/

public class InnerInherit extends OuterInheritedSecondClass {
    public static void main(String[] args) {
        OuterInheritedSecondClass secondInner = new OuterInheritedSecondClass();
        secondInner.display("Second Class");
    }
}

class OuterInheritedFirstClass {
    class InheritedClass {
        InheritedClass(String name) {
            System.out.printf("Hello I am first %s \n", name);
        }
    }
}

class OuterInheritedSecondClass extends OuterInheritedFirstClass{
    InheritedClass inner = new InheritedClass("InheritedClass");

    void display(String name){
        System.out.printf("I am the Second %s\n",name);
    }
}