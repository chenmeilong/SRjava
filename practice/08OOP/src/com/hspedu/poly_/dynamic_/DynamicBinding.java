package com.hspedu.poly_.dynamic_;
public class DynamicBinding {
    public static void main(String[] args) {
        //a 的编译类型 A, 运行类型 B
        A a = new B();//向上转型
        System.out.println(a.sum());//?40 -> 30
        System.out.println(a.sum1());//?30-> 20
    }
}
class A {//动态绑定机制:
    public int i = 10;
    public int sum() {return getI() + 10;}//20 + 10//父类sum()
    public int sum1() {return i + 10;}  //10 + 10 //父类sum1()
    public int getI() {return i;} //父类getI
}
class B extends A {//子类
    public int i = 20;
    public int sum() {return i + 20;}
    public int getI() {return i;} //子类getI()
    public int sum1() {return i + 10;}
}
