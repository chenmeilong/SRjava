package com.hspedu.houserenttest.domain;

public class House {
    private int index;
    private String name;
    private String phone;
    private String addr;
    private int rent;
    private String state;

    public House(int index, String name, String phone, String addr, int rent, String state) {
        this.index = index;
        this.name = name;
        this.phone = phone;
        this.addr = addr;
        this.rent = rent;
        this.state = state;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    @Override
    public String toString(){
        return index+"\t\t" + name +
                "\t" + phone +
                "\t\t" + addr +
                "\t" + rent +
                "\t" + state ;
    }
}
