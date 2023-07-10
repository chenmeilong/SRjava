package com.hspedu.practicepoly;

public class generalWork extends Employee {
    public generalWork() {
    }

    public generalWork(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }

    public void work(){
        System.out.println("我是普通员工，我叫"+super.getName()+"我是工资是"+getAnnual()+"，我正在工资ing");
    }
}
