package com.hspedu.homeworktest;

public class professor extends teacher{
    private double salartLevel = 1.3;

    public professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("我工资级别是"+this.salartLevel);
    }
}
