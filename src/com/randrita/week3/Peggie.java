package com.randrita.week3;
import java.util.Scanner;

/*1.Suppose you have a Peggie Employee with an initial amount of $50 and you have to add some more amount to it. Create a class 'Peggie' with a data member named 'amount' with an initial value of $50. Now make two constructors of this class as follows:
1 - without any parameter - no amount will be added to the Peggie Employee
2 - having a parameter which is the amount that will be added to Peggie Employee
*/


public class Peggie {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Enter the value you want to add to the peggie bag : ");
        int n = input.nextInt();
        AddAmount obj1 = new AddAmount();
        AddAmount obj2 = new AddAmount(n);

        obj1.display();
        obj2.display();
    }

}

class AddAmount{

    int amount=50;

    AddAmount(){

    }

    AddAmount(int a){
       amount=a+amount;
    }


    void display(){
        System.out.println("Total amount in peggie bag : " + amount);
    }

}
