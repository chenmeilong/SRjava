package com.hspedu.practicepoly;

public class ployparameter {
    public static void main(String[] args) {
        generalWork jack = new generalWork("jack", 5000);
        manaWork boss = new manaWork("boss", 6000, 20000);

        ployparameter role = new ployparameter();
        role.testWork(jack);
        role.showEmpAnnal(jack);

        role.testWork(boss);
        role.showEmpAnnal(boss);
    }

    public void showEmpAnnal(Employee e){
        System.out.println(e.getAnnual());//动态绑定机制
    }

    public void testWork(Employee e){
        if (e instanceof generalWork){
            ((generalWork)e).work();
        }
        else if (e instanceof manaWork){
            ((manaWork)e).manage();
        }
        else{
            System.out.println("error");
        }
    }


}
