package com.randrita.week7;

class Outerr{
    class Innerr{
        int i;
        Innerr(int i){
            this.i = i;
            System.out.println("I am a prameterized constructor with value = " + i);
        }

    }
}
class Anotherclass extends Outerr {
    class AnotherInner extends Outerr.Innerr{

        AnotherInner(int i) {
            super(i);
        }

        void view(){
            System.out.println("I am another innerclass that inherites another outer class");
        }
    }
}
public class forth{
    public static void main(String[] args) {


        Anotherclass a = new Anotherclass();
        Anotherclass.AnotherInner a1 = a.new AnotherInner(10);
        a1.view();
    }
}
