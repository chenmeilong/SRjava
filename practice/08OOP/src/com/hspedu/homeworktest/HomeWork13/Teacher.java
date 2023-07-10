package com.hspedu.homeworktest.HomeWork13;

public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }
    public void teach(){
        System.out.println("我承诺我会认真教书");
    }
    @Override
    public String play(){
        return  super.getName()+"爱玩象棋";
    }
}
