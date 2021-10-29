package com.randrita.week4;
import java.util.Scanner;


class Student{
      //intialising static variable
      static int temp=Integer.MIN_VALUE;
      static String k = "null";
      //counting total marks of each student
      static void count(int[] array,String name){
          int sum =0;
          for(int num:array){
              sum=sum+num;
          }
          Student.compare(sum,name);
      }
      //comparing it with next one
      static void compare(int x,String name){

              if(x>temp){
                  temp=x;
                  k=name;
              }
      }

      static void display(){
          System.out.println("The Highest Marks is "+ temp+" & Scored by "+k);
      }

}

public class StudentMarks {

    public static void main(String[] args) {

        System.out.println("Representing 3 Cases with 3 Subjects");
        System.out.println("------------------------------------");
        Scanner input = new Scanner(System.in);
        int t = 3;

        while (t-->0) {
            int[] arr = new int[3];
            System.out.print("Enter the name of the Student : ");
            String naam;
            input.nextLine();
            naam=input.nextLine();

            System.out.print("Enter the five numbers of subject in 'PCMBC' manner : ");
            for (int i = 0; i < 3; i++) {
                arr[i] = input.nextInt();
            }
            Student.count(arr,naam);
        }

        Student.display();

    }



}

