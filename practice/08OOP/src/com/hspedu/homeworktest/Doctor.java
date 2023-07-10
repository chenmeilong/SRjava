package com.hspedu.homeworktest;

import java.util.Objects;

public class Doctor {
    private String name;
    private int age;
    private String job;
    private String gender;
    private double salary;

    public Doctor(String name, int age, String job, String gender, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this){
            return true;
        }
        else if(obj instanceof Doctor){
            Doctor doctor = (Doctor)obj;
            return this.name.equals(doctor.name) && this.age==doctor.age &&this.job.equals(doctor.job)
                    &&this.gender.equals(doctor.gender) && this.salary == doctor.salary;
        }
        else{
            return false;
        }


    }

}
