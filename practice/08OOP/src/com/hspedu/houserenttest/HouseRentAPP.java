package com.hspedu.houserenttest;

import com.hspedu.houserenttest.domain.House;
import com.hspedu.houserenttest.view.HouseView;

import java.util.Scanner;

public class HouseRentAPP {
    public static void main(String[] args) {
/*        House house = new House(1, "jack", "1456898", "5南岗区",3000, "未出租");
        System.out.println(house);*/

        HouseView houseView = new HouseView();
        houseView.mainMenu();


    }
}
