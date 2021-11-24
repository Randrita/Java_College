package com.randrita.week7;

public class OuterMethod {

    public void modify(){
        System.out.println("I am in the OuterClass");
    }

    class InnerMethod{
        public void modify(){
            System.out.println("I am in the InnerClass");
        }
    }

    public void display(){
        InnerMethod inner = new InnerMethod();
        inner.modify();
    }

    public void outerDisplay(){
        modify();
    }

    public static void main(String[] args) {
         OuterMethod outer = new OuterMethod();
         outer.display();
         outer.outerDisplay();
    }
}
