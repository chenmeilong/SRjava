package com.hspedu.practicepoly;

public class Employee {
    private String name;
    private double salary;

    public Employee() {
    }
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getAnnual(){
        return this.salary*12;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

}
