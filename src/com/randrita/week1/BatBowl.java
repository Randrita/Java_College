package com.randrita.week1;
import java.util.Scanner;

//3.Write a member function for batsman class, which will take one integer as parameter. Add this integer with total run, increment no of innings and calculate other variables accordingly. Write a member function for bowler class, which will take two integers as parameter. Add one integer with runs given and another with wickets, increment no of innings and calculate other variables accordingly.

public class BatBowl {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.print("Enter the total number of innings: ");
    int f= input.nextInt();
    Bowlers result = new Bowlers();

    result.Batman(f);
    result.Bowlers(f);
    }

    //Batsman's End
    static class Batsman{
        public void Batman(int n){
            System.out.println("***Batsman's End***");
            int total_run=0;
            Scanner input= new Scanner(System.in);
            for (int i=1;i<=n;i++){
                System.out.print("Enter the total run of innings "+i + ": ");
                int x= input.nextInt(); //taking run as input
                total_run=total_run+x;
            }
            System.out.println("Total run in " + n +" innings is " + total_run);
        }

    }

    //Bowler's End
    static class Bowlers extends Batsman {

        public void Bowlers(int n){
            System.out.println("***Bowler's End***");
            int total_wicket=0;
            Scanner input= new Scanner(System.in);
            for (int i=1;i<=n;i++){
                System.out.print("Enter the total wickets of innings "+i + ": ");
                int x= input.nextInt(); //taking wicket as input
                total_wicket=total_wicket+x;
            }

            System.out.println("Total run in " + n +" innings is " + total_wicket);
        }

    }

}
