package com.hspedu.homeworktest;

public class Homework03 {
    public static void main(String[] args) {
        professor professor1 = new professor("jack", 45, "教授", 1300);
        professor1.introduce();

        teacher teacherwang = new lecture("wang", 32, "讲师", 1000);

        ((lecture) teacherwang).introduce();

    }
}



