package com.hspedu.encap;

public class Encapsulation01 {

    public static void main(String[] args) {
        //如果我们自己使用构造器指定属性
        Person smith = new Person("smith", 80, 50000);
        System.out.println("====smith的信息======");
        System.out.println(smith.info());


    }
}
class Person {
    public  String name; //名字公开
    private int age; //age 私有化
    private double salary; //..
    //有三个属性的构造器
    public Person(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    //写一个方法，返回属性信息
    public String info() {
        return "信息为 name=" + name  + " age=" + age + " 薪水=" + salary;
    }
}
