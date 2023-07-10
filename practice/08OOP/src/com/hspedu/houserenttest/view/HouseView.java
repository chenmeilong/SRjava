package com.hspedu.houserenttest.view;

import com.hspedu.houserent.utils.Utility;
import com.hspedu.houserenttest.domain.House;
import com.hspedu.houserenttest.service.HouseService;

import java.util.Scanner;

public class HouseView {
    Scanner scanner = new Scanner(System.in);
    private char key = ' ';
    boolean loopFlag = true;
    private HouseService houseService = new HouseService(10);


    public void listHouse(){
        System.out.println("-------------房屋列表-------------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");

        House[] houses = houseService.getHouses();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
    }
    public void find(){
        System.out.println("-------------查找 -------------");
        System.out.println("请输入要查找的id");
        int findId = Utility.readInt();

        House house = houseService.findById(findId);
        if(houseService.findById(findId) != null){
            System.out.println(house);
        }
        else{
            System.out.println("id不存在");
        }

    }
    public void update(){
        System.out.println("-------------修改 -------------");
        System.out.println("请选择待修改的编号（-1表示退出）");
        int updateId =Utility.readInt();
        if(updateId==-1){
            System.out.println("放弃修改房屋信息");
            return;
        }
        House house = houseService.findById(updateId);
        if(house == null){
            System.out.println("查找的不存在");
            return;
        }
        System.out.println("姓名（"+house.getName()+"):");
        String name = Utility.readString(8,"");
        if (!"".equals(name)){
            house.setName(name);
        }

        System.out.print("电话(" + house.getPhone() + "):");
        String phone = Utility.readString(12, "");
        if (!"".equals(phone)) {
            house.setPhone(phone);
        }
        System.out.print("地址(" + house.getAddr() + "): ");
        String address = Utility.readString(18, "");
        if (!"".equals(address)) {
            house.setAddr(address);
        }
        System.out.print("租金(" + house.getRent() + "):");
        int rent = Utility.readInt(-1);
        if (rent != -1) {
            house.setRent(rent);
        }
        System.out.print("状态(" + house.getState() + "):");
        String state = Utility.readString(3, "");
        if (!"".equals(state)) {
            house.setState(state);
        }
        System.out.println("=============修改房屋信息成功============");

    }


    public void exit(){
        char c = Utility.readConfirmSelection();
        if(c == 'Y'){
            System.out.println("-------------出租系统已退出 -------------");
            loopFlag = false;
        }
    }
    public void delHouse(){
        System.out.println("-------------删除房屋信息-------------");
        System.out.println("请输入待删除的房屋编号（-1退出）：");
        int delID = Utility.readInt();
        if(delID == -1){
            System.out.println("退出删除");
            return;
        }

        char choice = Utility.readConfirmSelection();
        if(choice == 'Y'){
            if(houseService.del(delID)){
                System.out.println("成功删除");
            }else{
                System.out.println("没有找到要删除的目标");
            }
        }else{
            System.out.println("放弃删除");
        }

    }


    public void addHouse(){
        System.out.println("-------------增加房源-------------");
        System.out.println("姓名：");
        String name = Utility.readString(8);
        System.out.println("电话：");
        String phone = Utility.readString(12);
        System.out.println("地址：");
        String addr = Utility.readString(16);
        System.out.println("月租：");
        int rent = Utility.readInt();
        System.out.println("状态：");
        String state = Utility.readString(3);

        House newHouse = new House(1, name, phone, addr, rent, state);
        if (houseService.add(newHouse)){
            System.out.println("添加房屋成功");
        }
        else{
            System.out.println("添加房屋失败");
        }

    }


    public void mainMenu(){

        do{
            System.out.println("-------------房屋出租系统-------------");
            System.out.println("\t\t\t1 新增房源");
            System.out.println("\t\t\t2 查找房屋");
            System.out.println("\t\t\t3 删除房屋");
            System.out.println("\t\t\t4 修改房屋信息");
            System.out.println("\t\t\t5 房屋列表");
            System.out.println("\t\t\t6 退   出");
            System.out.println("请输出你的选择1-6");

            key = Utility.readChar();
            switch (key){
                case '1' :
                    this.addHouse();
                    break;
                case '2':
                    this.find();
                    break;
                case '3':
                    this.delHouse();
                    break;
                case '4':
                    this.update();
                    break;
                case '5':
                    this.listHouse();  //查看房屋list
                    break;
                case '6':
                    exit();
                    break;
            }

        }while (loopFlag);

    }


}
