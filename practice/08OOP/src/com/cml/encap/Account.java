package com.cml.encap;

public class Account {
    private String name;
    private double money;
    private String password;

    public Account() {
    }

    public Account(String name, double money, String password) {
        this.setName(name);
        this.setMoney(money);
        this.setPassword(password);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>1 && name.length()<5){
            this.name = name;
        }
        else{
            System.out.println("名字不符合，已填写为默认名");
            this.name="默认名";
        }
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if(money > 20){
            this.money = money;
        }
        else{
            System.out.println("余额必须大于20");
        }
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(name.length()==6){
            this.password = password;
        }
        else {
            System.out.println("密码不符合，已填写为默认密码");
            this.password="000000";
        }
    }
    public void info(){
        System.out.println(this.name+" "+this.money+" "+this.password);
    }
}
