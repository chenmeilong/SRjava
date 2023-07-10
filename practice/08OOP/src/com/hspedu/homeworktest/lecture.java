package com.hspedu.homeworktest;

public class lecture extends teacher {
    private double salartLevel = 1.1;

    public lecture(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("我工资级别是"+this.salartLevel);
    }
}
