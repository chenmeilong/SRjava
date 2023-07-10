package com.hspedu.practicepoly;

public class manaWork extends Employee{
    private double bonus;

    public manaWork(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual()+bonus;
    }

    public void manage(){
        System.out.println("我是管理，"+"我叫"+super.getName()+",我的工资是"+getAnnual()+"我在管理ing");
    }
}
