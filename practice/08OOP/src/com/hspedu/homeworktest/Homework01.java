package com.hspedu.homeworktest;

public class Homework01 {

    public static void main(String[] args) {

        peopleArr= new Person("jack",15,"学生");


    }
}

class Person{
    private String name;
    private int age;
    private String job;

    public Person(){}

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public void info(){
        System.out.println(this.name+this.age+this.job);
    }
}