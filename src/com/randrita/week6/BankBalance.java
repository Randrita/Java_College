package com.randrita.week6;

/*A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively. We have to print the money deposited by him in a particular bank.
Create a class 'Bank' with a method 'getBalance' which returns 0. Make its three subclasses named 'BankA', 'BankB' and 'BankC' with a method with the same name 'getBalance' which returns the amount deposited in that particular bank. Call the method 'getBalance' by the object of each of the three banks.*/

public class BankBalance {
    public static void main(String[] args) {
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();

        //printing elements
        System.out.println("The amount deposited in BankA : $" + a.getBalance());
        System.out.println("The amount deposited in BankB : $" + b.getBalance());
        System.out.println("The amount deposited in BankC : $" + c.getBalance());
    }

}

class bank1{
    int getBalance(){
        return 0;
    }
}

class BankA extends bank1{
    int getBalance(){
        return 1000;
    }
}

class BankB extends bank1{
    int getBalance(){
        return 1500;
    }
}

class BankC extends bank1{
    int getBalance(){
        return 2000;
    }
}