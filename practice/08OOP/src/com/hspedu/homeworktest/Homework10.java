package com.hspedu.homeworktest;

public class Homework10 {
    public static void main(String[] args) {
        Doctor jack = new Doctor("jack", 45, "外科", "男", 7500);
        Doctor jack2 = new Doctor("jack", 45, "外科", "男", 7500);

        Doctor lucy = new Doctor("lucy", 47, "内科", "女", 10000);
        System.out.println(jack.equals(jack2));
        System.out.println(jack.equals(lucy));
    }
}
