package com.hspedu.homeworktest;

public class Work {
    private String name;
    private double daySalary;
    private double day;
    private double level;

    public Work(String name, double daySalary, double day, double level) {
        this.name = name;
        this.daySalary = daySalary;
        this.day = day;
        this.level = level;
    }

    double GetAllSalary(){
        return daySalary*day*level;
    }
}
