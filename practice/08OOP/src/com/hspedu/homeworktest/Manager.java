package com.hspedu.homeworktest;

public class Manager extends Work{

    public Manager(String name, double daySalary, double day, double level) {
        super(name, daySalary, day, level);
    }

    @Override
    double GetAllSalary() {
        return super.GetAllSalary()+1000;
    }
}
