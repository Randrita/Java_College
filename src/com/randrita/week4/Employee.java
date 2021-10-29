package com.randrita.week4;
import java.util.Scanner;

public class Employee
{
    public static void main(String arg[])
    {
        double gs,it,pt,pf,netSalary,ov;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Gross salary");
        gs=sc.nextDouble();
        System.out.println("Enter Income Tax %");
        it=sc.nextDouble();
        System.out.println("Enter Professional Tax %");
        pt=sc.nextDouble();
        System.out.println("enter Provident Fund %");
        pf=sc.nextDouble();

        System.out.println("Enter the extra time employee worked in hr %");
        ov=sc.nextDouble();

        netSalary=salary(gs,pf,pt,it);
        System.out.println("Net Salary is="+netSalary);
        OvertimeCalculator.overtime(ov);

    }
    static double salary(double gs,double pf,double pt,double it)
    {
        pf=pf*(gs/100);
        it=it*(gs/100);
        pt=pt*(gs/100);
        double n=gs-it-pt-pf;
        return n;
    }
}

class OvertimeCalculator{
    static void overtime(double time_worked)
    {
        double over_time,overtime_pay;
        if (time_worked>40)
        {
            over_time = time_worked - 40;
            overtime_pay = (12 * over_time);
            System.out.println("The overtime pay is ="+overtime_pay);

        }

    }
}
