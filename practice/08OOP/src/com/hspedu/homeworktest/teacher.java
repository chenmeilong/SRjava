package com.hspedu.homeworktest;

public class teacher {
    private  String name;
    private int age;
    private String post;
    private double salary;

    public teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }
    public void introduce(){
        System.out.print("我叫"+this.name+",我今年"+this.age+"岁，我是"+this.post+",我的基本工资是"+this.salary);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPost() {
        return post;
    }

    public double getSalary() {
        return salary;
    }


}
