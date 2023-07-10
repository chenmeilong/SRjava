package com.hspedu.homeworktest.HomeWork13;

public class HomeWork13main {
    public static void main(String[] args) {

        Person[] a = new Person[4];
        a[0] = new Student("jack",'男',15,"123");
        a[1] = new Student("lucy",'女',14,"122");
        a[2] = new Teacher("wang",'女',54,12);
        a[3] = new Teacher("li",'女',44,5);
        
        //按照年龄排序
        Person swap = null;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length ; j++) {
                if (a[i].getAge()<a[j].getAge()){
                    swap = a[j];
                    a[j]=a[i];
                    a[i]=swap;
                }
            } 
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].getAge());
        }

        ((Teacher)a[0]).teach();
        System.out.println(((Teacher)a[0]).play());;
        ((Teacher)a[1]).teach();
        System.out.println(((Teacher)a[1]).play());;
        ((Student)a[2]).study();
        ((Student)a[2]).play();
        ((Student)a[3]).study();
        ((Student)a[3]).play();

    }
}
