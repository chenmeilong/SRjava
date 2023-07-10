package com.hspedu.homeworktest;

public class homeWork04 {
    public static void main(String[] args) {

        CommonWork jack = new CommonWork("jack", 100, 1, 1.0);

        System.out.println(jack.GetAllSalary());

        Manager wang = new Manager("wang", 200, 1, 1.2);
        System.out.println(wang.GetAllSalary());

    }
}
