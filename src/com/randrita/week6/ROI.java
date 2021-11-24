package com.randrita.week6;

/*
Consider a scenario, ROI is a class that provides functionality to get rate of interest.
But, rate of interest varies according to banks. For example, SBI, ICICI and AXIS banks could
provide 8%, 7% and 9% rate of interest.
*/

class Bank{
    int r;
    void rate_of_interest(int r){
        this.r = r;
    }
}

//for SBI Bank
//-------------------------------------------------
class SBI extends Bank{
    int r;

    @Override
    void rate_of_interest(int r)
    {
        super.rate_of_interest(0);
        this.r=r;
    }

    void display(){
        System.out.println("The Rate of interest in SBI Bank is : "+r+'%');
    }
}

//for ICICI Bank
//-------------------------------------------------

class ICICI extends Bank{
    int r;

    @Override
    protected void rate_of_interest(int r){
        super.rate_of_interest(8);
        this.r=r;
    }

    protected void display(){
        System.out.println("The Rate of interest in ICICI Bank is : "+r+'%');
    }
}

//for AXIS Bank
//-------------------------------------------------

class AXIS extends Bank{
    int r;

    @Override
    public void rate_of_interest(int r){
        this.r=r;
    }

   public void display(){
        System.out.println("The Rate of interest in Axis Bank is : "+r+'%');
    }
}

//main method
public class ROI {
    public static void main(String...args) {

        SBI obj_sbi = new SBI();
        obj_sbi.rate_of_interest(8);
        obj_sbi.display();

        ICICI obj_icici = new ICICI();
        obj_icici.rate_of_interest(7);
        obj_icici.display();

        AXIS obj_axis = new AXIS();
        obj_axis.rate_of_interest(9);
        obj_axis.display();
    }
}
