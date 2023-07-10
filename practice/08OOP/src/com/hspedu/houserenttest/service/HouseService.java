package com.hspedu.houserenttest.service;

import com.hspedu.houserenttest.domain.House;

public class HouseService {
    private House[] houses;//保存house对象
    private int houseNums = 1;
    private int idCount = 1;

    public HouseService(int size) {
        houses = new House[size];//创建对象时，指定数组大小
        houses[0] = new House(1,"jack","123","南岗区",3000,"已出租");
    }

    public boolean del(int delID){
        int index=-1;
        for (int i = 0; i < houseNums; i++) {
            if(houses[i].getIndex()==delID){
                index = i;
            }
        }
        if(index==-1) {
            return false;
        }
        for (int i = index; i < houseNums-1; i++) {
            houses[i]=houses[i+1];
        }
        houses[--houseNums]=null;
        return true;
    }
    public House findById(int findId){
        for (int i = 0; i < houseNums; i++) {
            if(houses[i].getIndex()==findId){
                return houses[i];
            }
        }
        return null;
    }

    public boolean add(House newHouse){
        if(houseNums >= houses.length){
            System.out.println("数组需要扩容");
            return false;
        }
        houses[houseNums++] = newHouse;
        newHouse.setIndex(++idCount);
        return true;
    }

    public House[] getHouses() {
        return houses;
    }
}
