package com.randrita.week7;

import java.sql.SQLOutput;

public class Complex {
    int realNumber,imaginaryNumber;

    Complex(int realNumber,int imaginaryNumber){
        this.realNumber=realNumber;
        this.imaginaryNumber=imaginaryNumber;
    }

    public static void main(String[] args) {
        Complex number1 = new Complex(5,10);
        Complex number2 = new Complex(2,5);
        Complex Add,Sub,Multi,Div;

        Add=add(number1,number2);
        Sub=sub(number1,number2);
        Multi=multiplication(number1,number2);
        Div=division(number1,number2);

        System.out.printf("Addition of two complex numbers is = %d+%di\n",Add.realNumber,Add.imaginaryNumber);
        System.out.printf("Subtraction of two complex numbers is = %d+%di\n",Sub.realNumber,Sub.imaginaryNumber);
        System.out.printf("Multiplication of two complex numbers is = %d+%di\n",Multi.realNumber,Multi.imaginaryNumber);
        System.out.printf("Division of two complex numbers is = %d+%di\n",Div.realNumber,Div.imaginaryNumber);
    }

    public static Complex add(Complex number1, Complex number2){
        Complex temp = new Complex(0,0);

        temp.realNumber= number1.realNumber+ number2.realNumber;
        temp.imaginaryNumber=number1.imaginaryNumber+number2.imaginaryNumber;

        return(temp);
    }

    public static Complex sub(Complex number1, Complex number2){
        Complex temp = new Complex(0,0);

        temp.realNumber= number1.realNumber- number2.realNumber;
        temp.imaginaryNumber=number1.imaginaryNumber-number2.imaginaryNumber;

        return(temp);
    }

    public static Complex multiplication(Complex number1, Complex number2){
        Complex temp = new Complex(0,0);

        temp.realNumber= (number1.realNumber*number2.realNumber)-(number1.imaginaryNumber *number2.imaginaryNumber );
        temp.imaginaryNumber=(number1.realNumber* number2.imaginaryNumber)+(number1.imaginaryNumber*number2.realNumber);

        return(temp);
    }

    public static Complex division(Complex number1, Complex number2){
        Complex temp = new Complex(0,0);

        int a= number1.realNumber;
        int b= number1.imaginaryNumber;
        int c=number2.realNumber;
        int d=number2.imaginaryNumber;

        temp.realNumber=((a*c)+(b*d))/((c*c)+(d*d));
        temp.imaginaryNumber=((b*c)-(a*d))/((c*c)+(d*d));

        return(temp);

    }
}

