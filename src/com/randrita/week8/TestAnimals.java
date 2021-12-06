package com.randrita.week8;

abstract class Animal {
    protected int legs;

    protected Animal(int legs){
        this.legs=legs;
    }

    abstract void eat();

    public void walk(){
        System.out.println("I have:"+legs+" legs.");
    }
}

class Spider extends Animal{
     Spider(){
        super(8);
    }

    public void eat(){
        System.out.println("I like to eat meat!");
    }
}

interface pet{
    public String getName();
    public void setName(String petName);
    public void play();
}

class Cat extends Animal implements pet{
    String petName;
    Cat(String petName){
        super(4);
        this.petName=petName;
    }

    Cat(){
     this("");
    }

    public String getName(){
        return petName;
    }

    public void setName(String petName){
        this.petName=petName;
    }

    @Override
    public void play() {
        System.out.println("I love to walk!");
    }

    @Override
    void eat() {
        System.out.println("I love milk!");
    }
}

class Fish extends Animal implements pet {
    Fish() {
        super(0);
    }

    private String fishName;

    public void eat() {
        System.out.println("I like to eat insects!");
    }

    public String getName() {
        return fishName;
    }

    public void setName(String fishName) {
        this.fishName = fishName;
    }

    public void play() {
        System.out.println("I love to swim");
    }

    public void walk() {
        System.out.println("I have:" + legs + " legs.");
    }
}
public class TestAnimals {
    public static void main(String[] args) {
        Cat c = new Cat("Fluffy");

        Animal a = new Fish();

        Animal e = new Spider();

        pet p = new Cat();

        //spider
        System.out.println("Hello I'm Spider Class!");
        e.eat();
        e.walk();
        System.out.println("==================");

        //pet
        System.out.println("Hello I'm Pet Interface!");
        p.setName("Leo");
        System.out.println("My pet's name is: "+p.getName());
        p.play();
        System.out.println("==================");

        //cat
        System.out.println("Hello I'm Cat Class!");
        System.out.println("My cat's name is:"+c.getName());
        c.walk();
        c.eat();
        c.play();
        System.out.println("==================");

        //fish
        System.out.println("Hello I'm Fish Class!");
        a.walk();
        a.eat();
        System.out.println("==================");


    }
}


