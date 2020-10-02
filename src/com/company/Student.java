package com.company;

public class Student {
    public String name;
    public double sum=0, average=0,amount;
    public Student(String studentName){
        name = studentName;
    }
    public void inputGrades(double x){
        sum += x;
    }
    public double getAverage(){
        average = sum/amount;
        return average;
    }
    public void getAmount(double x){
        amount=x;
    }
    public String printName(){
        return name;
    }
}
