/*
Jacob Choi
Tracking Grades Lab
9/30/2020
Extra: Letting the user choose how many grades they want to enter for each student
*/
package com.company;
import java.util.Scanner;
public class Main {
    //Defining Scanner
        public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //Getting the input for the two names
        System.out.println("Enter name: ");
        String name1 = in.next();
        Student student1 = new Student (name1);
        //Defining the variable to use later
        double grades;
        //Extra: Letting user choose how many grades they want to enter
        System.out.println("How many grades would you like to enter for " + student1.printName());
        double howMany = in.nextDouble();
        student1.getAmount(howMany);
        for (int i = 0; i < howMany; i++) {
            System.out.println("Enter grade " + (i+1) +  " for " + student1.printName() + ": ");
            grades = in.nextDouble();
            student1.inputGrades(grades);
        }
        //Outputting the average
        System.out.println("Average for " + student1.printName() + ": " + student1.getAverage());
        //Same for student 2
        System.out.println("Enter name: ");
        String name2 = in.next();
        Student student2 = new Student (name2);
        System.out.println("How many grades would you like to enter for " + student2.printName());
        howMany = in.nextDouble();
        student2.getAmount(howMany);
        for (int i = 0; i < howMany; i++) {
            System.out.println("Enter grade " + (i+1) +  " for " + student2.printName() + ": ");
            grades = in.nextDouble();
            student2.inputGrades(grades);
        }
        System.out.println("Average for " + student2.printName() + ": " + student2.getAverage());
    }
}
